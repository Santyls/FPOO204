public class Entrega {

    private String numeroGuia;
    private String estado;

    public String getNumeroGuia() {
        return numeroGuia;
    }

    public String getEstado() {
        return estado;
    }

    public Entrega(String numeroGuia) {
        this.numeroGuia = numeroGuia;
        this.estado = "Pendiente";
    }

    public void actualizarEstado(int nuevoEstado){
        switch (nuevoEstado){
            case 0:
                this.estado = "En tránsito";
                break;
            case 1:
                this.estado = "Entregado";
                break;
            default:
                this.estado = "Pendiente";
                break;
        }
    }

}
