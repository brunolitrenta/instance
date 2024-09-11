public class Fila {
    private static Fila instancia;

    private Fila () {}

    public void ImprimeDocumento(){
    }
    public void RemoveDocumento(){
    }
    public void RemoveTodosDocumentos(){
    }

    public static Fila getInstance(){
        if (instancia == null) {
            instancia = new Fila();
        }
        return instancia;
    }
}
