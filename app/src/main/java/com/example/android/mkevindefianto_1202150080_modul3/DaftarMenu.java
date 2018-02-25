package com.example.android.mkevindefianto_1202150080_modul3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class DaftarMenu extends AppCompatActivity {

    //menginisiasikan variable

    private RecyclerView recyclerView;
    private MinumanAdapter mAdapter;

    public static ArrayList<MinumanItem> DATAS;
    //agar activity dapat berfungsi dan akan bisa dipanggil oleh activity selanjutnya / pindah activity
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_menu);
        //memanggil variable
        DATAS = isi();
        recyclerView = (RecyclerView)findViewById(R.id.RecyclerList1);
        mAdapter = new MinumanAdapter(DATAS);
        recyclerView.setAdapter(mAdapter);

        //menyeduasikan tampilan ketika emulator menjadi landscap
        int gridColumnCount = getResources().getInteger(R.integer.grid_column_count);

        recyclerView.setLayoutManager(new GridLayoutManager(this, gridColumnCount));

    }
    // Untuk Menampung banyak data
    public ArrayList<MinumanItem> isi(){
        ArrayList<MinumanItem> data = new ArrayList<>();
        data.add(new MinumanItem("Aqua","Ini adalah Air Minum merk AQUA","Aqua adalah sebuah merek air minum dalam kemasan (AMDK) yang diproduksi oleh PT Aqua Golden Mississippi Tbk di Indonesia sejak tahun 1973. Selain di Indonesia, Aqua juga dijual di Malaysia, Singapura, dan Brunei. Aqua adalah merek AMDK dengan penjualan terbesar di Indonesia dan merupakan salah satu merek AMDK yang paling terkenal di Indonesia, sehingga telah menjadi seperti merek generik untuk AMDK. ",R.drawable.aqua));
        data.add(new MinumanItem("Amidis","Ini adalah Air Minum  merk AMIDIS","AMIDIS adalah air minum kesehatan yang diproses melalui sistem distilasi atau penyulingan atau penguapan,melalui proses pemanasan hingga 180 derajat celcius sehingga menghasilkan air minum yang murni (NON-MINERAL) tanpa kandungan polutan, mineral anorganik maupun bahan kontaminasi lain seperti bahan kimia maupun bahan pestisida.",R.drawable.amidis));
        data.add(new MinumanItem("Ades","Ini adalah Air Minum  merk Ades","Ades (sebelumnya pernah disebut AdeS) adalah merek air mineral atau air minum dalam kemasan (AMDK) yang diproduksi oleh PT. Coca-Cola Bottling Indonesia, Bekasi. Air mineral tersebut juga dikenal sebagai I-Lohas di Jepang.",R.drawable.ades));
        data.add(new MinumanItem("Cleo","Ini adalah Air Minum  merk CLEO","Cleo adalah air murni berkadar kemurnian 99,99% mengandung oksigen sampai dengan 8mg/L @ 20°C. Air Murni Cleo diambil dari mata air pegunungan dan diproses melalui hyper membrane filter 0,0001 mikron sehingga tidak mengandung mikroorganisme dan mineral anorganik, misalnya chlorine dan natrium fluoride.",R.drawable.cleo));
        data.add(new MinumanItem("Club","Ini adalah Air Minum  merk CLUB","Club adalah produk perusahaan Grup Tirta Bahagia (TB) yang berdiri sejak akhir 80an. Saat ini, perusahaan itu telah di akuisisi oleh  PT Indofood CBP Sukses Makmur Tbk (ICBP) melalui dua anak usahanya PT Tirta Makmur Perkasa (TMP) dan PT Tirta Sukses Perkasa (TSP) sebesar Rp 2,2 triliun. Air minum ini awalnya hanya di pasarkan di Jawa Timur, Sekarang kita bisa melihatnya dimana-mana.",R.drawable.club));
        data.add(new MinumanItem("Equil","Ini adalah Air Minum  merk EQUIL","Equil adalah air minum yang cukup terkenal di kalangan menengah atas dan ekspatriat. Morgen Sutanto adalah pendiri  PT. Equilindo Lestari dan memulai usahanya tahun 1997. Ia melihat potensi air mineral murni cukup luas terbuka lebar. Para produsen lokal saat itu hanya bermain dalam produk air minum dalam kemasan (AMDK). Untuk air mineral premium masih dikuasai produk impor. Indonesia kaya akan mata air, akan sangat ironis kalau air pun harus mengimpor. Sekarang kita bisa melihat Equil hadir di meja restoran, hotel bintang lima, hingga meja Istana Negara saat rapat kabinet.",R.drawable.equil));
        data.add(new MinumanItem("Evian","Ini adalah Air Minum  merk EVIAN","",R.drawable.evian));
        data.add(new MinumanItem("Le Minerale","Ini Air Minum  AMDK merk LE MINERALE","",R.drawable.leminerale));
        data.add(new MinumanItem("Nestle","Ini adalah Air Minum  merk NESTLE","Dulu Nestle PureLife bernama Aberfoyle Springs karena diproduksinya oleh Aberfoyle Springs sejak tahun 1993. Namun pada 2002, Nestle membelinya dan mengganti namanya menjadi pun dilakukan menjadi Nestle Pure Life Natural Spring Water. Penjualan produk ini mencapai 5 juta air per hari. Hal yang menarik dari Nestle adalah dari proses pemurnian airnya. Begitupun dengan botol-botolnya, hingga mengalami 12 langkah pemurnian dan peningkatan kualitas.",R.drawable.nestle));
        data.add(new MinumanItem("Pristine","Ini adalah Air Minum  merk PRISTINE","",R.drawable.pristine));
        data.add(new MinumanItem("Vit","Ini adalah Air Minum  merk VIT","",R.drawable.vit));
        return data;
    }
}
