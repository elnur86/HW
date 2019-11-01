package hw.hw5;

public class schedule {
    String[][] schdl = new String[7][2];

    schedule(String[][] schdl)
    {
        this.schdl[0][0]="Monday";
        this.schdl[0][1]="Do HomeWork for Tuesday";
        this.schdl[1][0]="Tuesday";
        this.schdl[1][1]="Classes for Tuesday";
        this.schdl[2][0]="Wednesday";
        this.schdl[2][1]="Do HomeWork for Thursday";
        this.schdl[3][0]="Thursday";
        this.schdl[3][1]="Classes for Thursday";
        this.schdl[4][0]="Friday";
        this.schdl[4][1]="Do HomeWork for Saturday";
        this.schdl[5][0]="Saturday";
        this.schdl[5][1]="Classes for Saturday";
        this.schdl[6][0]="Sunday";
        this.schdl[6][1]="Relax";
    }

}
