package sg.edu.rp.c346.id22018526.mymodules;

import java.io.Serializable;

public class Module implements Serializable {

    public String code;
    public String modname;
    public String year;
    public int semester;
    public int modcredit;
    public String venue;

    public Module(String code, String modname, String year, int semester, int modcredit, String venue) {
        this.code = code;
        this.modname = modname;
        this.year = year;
        this.semester = semester;
        this.modcredit = modcredit;
        this.venue = venue;
    }



}
