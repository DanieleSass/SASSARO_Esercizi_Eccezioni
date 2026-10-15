package org.example.Esercizio1;

public class ImportoNonValidoException extends RuntimeException {
    public ImportoNonValidoException(String message) {
        super(message);
    }

    public ImportoNonValidoException(){
        super("Importo non valido");
    }
}
