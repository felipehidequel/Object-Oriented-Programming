
public class AppFaculdade {
    public static void main(String args[]){
        RegistroAcademico a1 = new RegistroAcademico("Felipe", 2022, "BTI");
        RegistroAcademicoPosGraduacao a2 = new RegistroAcademicoPosGraduacao(a1, "Tese", "Walber José");
        // System.out.println(a1);
        System.out.println(a2);
    }
}