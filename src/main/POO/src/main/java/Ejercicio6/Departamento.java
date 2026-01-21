package Ejercicio6;
import java.util.List;
import java.util.ArrayList;
class Departamento {
    private String cod_dep;
    private String nombreDep;
    private AreaConocimiento areaConocimiento;
    private List<Profesor> profesorList= new ArrayList<>();
    private List<Catedra> catedraList = new ArrayList<>();

    public Departamento(String cod_dep, String nombreDep, AreaConocimiento areaConocimiento) {
        this.cod_dep = cod_dep;
        this.nombreDep = nombreDep;
        this.areaConocimiento = areaConocimiento;
        this.areaConocimiento.getDepartamentoList().add(this);
    }public String getCod_dep() {
        return cod_dep;
    }public void setCod_dep(String cod_dep) {
        this.cod_dep = cod_dep;
    }public String getNombreDep() {
        return nombreDep;
    }public void setNombreDep(String nombreDep) {
        this.nombreDep = nombreDep;
    }public AreaConocimiento getAreaConocimiento() {
        return areaConocimiento;
    }public void setAreaCon(AreaConocimiento areaConocimiento) {
        this.areaConocimiento = areaConocimiento;
    }public List<Profesor> getProfesorList() {
        return profesorList;
    }public List<Catedra> getCatedraList() {
        return catedraList;
    }@Override
    public String toString() {
        return "Departamento: " + nombreDep + ", id: " + cod_dep
                + ", areaConeixement: " + areaConocimiento.getCod_con() + "\n";
    }
}