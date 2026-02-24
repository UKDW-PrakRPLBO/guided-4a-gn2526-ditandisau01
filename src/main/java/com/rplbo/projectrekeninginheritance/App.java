package com.rplbo.projectrekeninginheritance;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        RekeningBisnis rb = new RekeningBisnis(new Nasabah("a", "1", "jl. 1"), 100000);
        rb.penyetoran(100000); //200rb++
        rb.penarikan(25000); //
        System.out.println(rb.getSaldo());

        RekeningKeluarga rk = new RekeningKeluarga(new Nasabah("b", "2", "jl. 2"), 200000);
        rk.penyetoran(100000);
        rk.penarikan(25000);
        System.out.println(rk.getSaldo());

        RekeningSyariah rs = new RekeningSyariah(new Nasabah("c", "3", "jl. 3"), 50000);
        rs.penyetoran(150000);
        rs.penarikan(25000);
        rs.sumbangan(30000);
        System.out.println(rs.getSaldo());

        RekeningUtama ru = new RekeningUtama(new Nasabah("d", "4", "jl. 4"), 75000);
        ru.penyetoran(300000);
        ru.penarikan(3500000);
        System.out.println(ru.getSaldo());

        RekeningTambahan rt = new RekeningTambahan(new Nasabah("e", "5", "jl. 5"), 150000);
        rt.penyetoran(150000);
        rt.penarikan(600000);
        System.out.println(rs.getSaldo());
    }
}
