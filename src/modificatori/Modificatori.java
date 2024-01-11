package modificatori;

public class Modificatori {

    /**
     * Modificatori de acces:
     *  - private - > este cel mai restrictiv: este vazut doar in interiorul clasei
     *  - default -> este vazut doar in interiorul pachetului unde a fost definit -> daca nu definim nici un alt modificator de
     *               acces in fata fieldului atunci acesta este modificatorul default
     *  - protected -> este vazut in interiorul pachetului und e a fost definit dar si in clasa care mostenestes
     *                 calsa in care este definit acest field
     *  - public -> este vazut in interiorul intregului proiect (cel mai permisiv)
     *
     *
     *
     *
     *
     * */

    private String field1;
    String field2;

    protected String field3;

    public String field4;




}
