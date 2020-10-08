package com.ananta.tantanganmp

class Logic {
    var hasil = 0.0;

    fun tambah(n1 : Double, n2 : Double, n3 : Double, n4 : Double) : Double{
        this.hasil = n1+n2+n3+n4;
        return n1+n2+n3+n4;
    }
    fun min(n1 : Double, n2 : Double, n3 : Double, n4 : Double) : Double{
        this.hasil = n1-n2-n3-n4;
        return n1-n2-n3-n4;
    }
    fun kali(n1 : Double, n2 : Double, n3 : Double, n4 : Double) : Double{
        this.hasil = n1*n2*n3*n4;
        return n1*n2*n3*n4;
    }
    fun bagi(n1 : Double, n2 : Double, n3 : Double, n4 : Double) : Double{
        this.hasil = n1/n2/n3/n4;
        return n1/n2/n3/n4;
    }

}
