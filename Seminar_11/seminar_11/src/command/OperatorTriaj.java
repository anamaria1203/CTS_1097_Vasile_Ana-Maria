package command;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class OperatorTriaj {
    private Queue<Command> comenzi;
    private Stack<Command> undo;
    private Stack<Command> redo;

    public OperatorTriaj(Stack<Command> undo, Stack<Command> redo) {
        this.comenzi = new LinkedList<>();
        this.undo = undo;
        this.redo = redo;
    }

    public OperatorTriaj() {
        this.comenzi = new LinkedList<>();
        this.undo = new Stack<>();
        this.redo = new Stack<>();
    }

    public void trimiteComanda() {
        if (!this.comenzi.isEmpty()) {
            Command comanda = this.comenzi.poll();
            comanda.executa();
            this.undo.push(comanda);
            this.redo.clear();
        } else {
            System.out.println("Nu mai exista comenzi");
        }
    }

    public void adaugaComanda(Command comanda) {
        this.comenzi.add(comanda);
    }

    public void anuleazaComanda() {
        if (!this.undo.isEmpty()) {
            Command comanda = this.undo.pop();
            comanda.executa();
            this.redo.push(comanda);
        } else {
            System.out.println("Nu mai exista comenzi");
        }
    }

    public void refacereComanda() {
        if (!this.redo.isEmpty()) {
            Command comanda = this.redo.pop();
            comanda.executa();
            this.undo.push(comanda);
        } else {
            System.out.println("Nu mai exista comenzi");
        }
    }
}