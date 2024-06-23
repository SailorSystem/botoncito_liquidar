
package botoncitoliquidacionrh;

import java.util.Date;


public class Nomina {
    private String nomCodigo;
    private int empCodigo;
    private String nomAnio;
    private String nomMes;
    private Date nomFechaEmision;
    private String nomStatus;

    public Nomina(String nomCodigo, int empCodigo, String nomAnio, String nomMes, Date nomFechaEmision, String nomStatus) {
        this.nomCodigo = nomCodigo;
        this.empCodigo = empCodigo;
        this.nomAnio = nomAnio;
        this.nomMes = nomMes;
        this.nomFechaEmision = nomFechaEmision;
        this.nomStatus = nomStatus;
    }

    public String getNomCodigo() {
        return nomCodigo;
    }

    public int getEmpCodigo() {
        return empCodigo;
    }

    public String getNomAnio() {
        return nomAnio;
    }

    public String getNomMes() {
        return nomMes;
    }

    public Date getNomFechaEmision() {
        return nomFechaEmision;
    }

    public String getNomStatus() {
        return nomStatus;
    }
}