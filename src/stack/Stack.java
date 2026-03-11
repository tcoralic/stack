package stack;

/**
 * Generic Stack implementation using an array.
 * Stack arbeitet nach dem LIFO Prinzip (Last In First Out):
 * Das zuletzt eingefügte Element wird zuerst wieder entfernt.
 *
 * @param <T> Datentyp der Elemente im Stack (Generic)
 */
public class Stack<T> {

    // Array, in dem die Stack-Elemente gespeichert werden
    // Object wird verwendet, weil Generics keine Arrays direkt erlauben
    private Object[] elements;

    // Index des obersten Elements im Stack
    // -1 bedeutet: Stack ist leer
    private int top;

    /**
     * Default-Konstruktor
     * Erstellt einen Stack mit der Standardgröße 10
     */
    public Stack() {

        // Array mit Platz für 10 Elemente erstellen
        elements = new Object[10];

        // Stack ist am Anfang leer → top = -1
        top = -1;
    }

    /**
     * Konstruktor mit frei wählbarer Größe
     */
    public Stack(int capacity) {

        // Array mit der gewünschten Kapazität erstellen
        elements = new Object[capacity];

        // Stack startet leer
        top = -1;
    }

    /**
     * Fügt ein Element oben auf den Stack (push)
     */
    public void push(T value) throws StackFullException {

        // Prüfen ob der Stack voll ist
        // Wenn top am letzten Index des Arrays ist, gibt es keinen Platz mehr
        if (top == elements.length - 1) {

            // Exception werfen, weil kein Platz mehr vorhanden ist
            throw new StackFullException("Stack is full!");
        }

        // Top-Index um 1 erhöhen (wir gehen eine Position nach oben)
        top++;

        // Neues Element an dieser Position speichern
        elements[top] = value;
    }

    /**
     * Entfernt und liefert das oberste Element des Stacks (pop)
     */
    public T pop() throws StackEmptyException {

        // Prüfen ob Stack leer ist
        if (top == -1) {

            // Exception werfen, da kein Element entfernt werden kann
            throw new StackEmptyException("Stack is empty!");
        }

        // Element vom Stack holen
        // Cast nötig, da Array vom Typ Object ist
        T value = (T) elements[top];

        // Top-Index um 1 reduzieren (ein Element weniger im Stack)
        top--;

        // Entferntes Element zurückgeben
        return value;
    }

    /**
     * Gibt das oberste Element zurück ohne es zu entfernen (peek)
     */
    public T peek() throws StackEmptyException {

        // Prüfen ob Stack leer ist
        if (top == -1) {

            // Exception werfen, weil kein Element vorhanden ist
            throw new StackEmptyException("Stack is empty!");
        }

        // Oberstes Element zurückgeben (Cast zu T notwendig)
        return (T) elements[top];
    }

    /**
     * Gibt alle Elemente des Stacks als String zurück
     * Elemente werden mit ";" getrennt
     */
    public String list() {

        // String für das Ergebnis
        String result = "";

        // Schleife über alle vorhandenen Elemente im Stack
        for (int i = 0; i <= top; i++) {

            // Element zum Ergebnisstring hinzufügen
            result += elements[i];

            // Wenn es nicht das letzte Element ist → ; hinzufügen
            if (i < top) {
                result += ";";
            }
        }

        // Gesamten String zurückgeben
        return result;
    }
}