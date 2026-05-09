package definelang;

import definelang.Env.ExtendEnv;
import definelang.Env.GlobalEnv;

import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

import static definelang.AST.*;
import static definelang.Value.NumVal;
import static definelang.Value.UnitVal;


public class Evaluator implements Visitor<Value> {

    private final Env initialEnv = new GlobalEnv(); // new for DefineLang
    private final Set<String> definedGlobals = new HashSet<>();


    Value valueOf(Program p) {
        return (Value) p.accept(this, initialEnv);
    }

    @Override
    public Value visit(AddExp e, Env env) {
        List<Exp> operands = e.all();
        double result = 0;
        for (Exp exp : operands) {
            NumVal intermediate = (NumVal) exp.accept(this, env);
            result += intermediate.v();
        }
        return new NumVal(result);
    }

    @Override
    public Value visit(UnitExp e, Env env) {
        return new UnitVal();
    }

    @Override
    public Value visit(NumExp e, Env env) {
        return new NumVal(e.v());
    }

    @Override
    public Value visit(DivExp e, Env env) {
        List<Exp> operands = e.all();
        NumVal lVal = (NumVal) operands.getFirst().accept(this, env);
        double result = lVal.v();
        for (int i = 1; i < operands.size(); i++) {
            NumVal rVal = (NumVal) operands.get(i).accept(this, env);
            result = result / rVal.v();
        }
        return new NumVal(result);
    }

    @Override
    public Value visit(MultExp e, Env env) {
        List<Exp> operands = e.all();
        double result = 1;
        for (Exp exp : operands) {
            NumVal intermediate = (NumVal) exp.accept(this, env);
            result *= intermediate.v();
        }
        return new NumVal(result);
    }

    @Override
    public Value visit(Program p, Env env) {
        try {
            for (DefineDecl d : p.decls())
                d.accept(this, initialEnv);
            return (Value) p.e().accept(this, initialEnv);
        } catch (ClassCastException e) {
            return new Value.DynamicError(e.getMessage());
        }
    }

    @Override
    public Value visit(SubExp e, Env env) {
        List<Exp> operands = e.all();
        NumVal lVal = (NumVal) operands.getFirst().accept(this, env);
        double result = lVal.v();
        for (int i = 1; i < operands.size(); i++) {
            NumVal rVal = (NumVal) operands.get(i).accept(this, env);
            result = result - rVal.v();
        }
        return new NumVal(result);
    }

    @Override
    public Value visit(VarExp e, Env env) { // New for varlang
        return env.get(e.name());
    }

    @Override
    public Value visit(LetExp e, Env env) {
        List<String> names = e.names();
        List<Exp> value_exps = e.value_exps();

        Env cur = env; // env(k+1)

        for (int i = names.size() - 1; i >= 0; i--) {
            Value vi = (Value) value_exps.get(i).accept(this, cur);
            cur = new ExtendEnv(cur, names.get(i), vi);
        }

        return (Value) e.body().accept(this, cur);
    }

    @Override
    public Value visit(DefineDecl e, Env env) {
        String name = e.name();

        if (definedGlobals.contains(name)) {
            System.out.println("Re-declaration of variable " + name
                    + " detected. Discarding redefinition.");
            return new UnitVal();
        }

        Value value = (Value) e.value_exp().accept(this, env);
        ((GlobalEnv) initialEnv).extend(name, value);
        definedGlobals.add(name);

        return new UnitVal();
    }

}
