package com.example.apktesting

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.apktesting.databinding.ActivityMainBinding
import com.example.listview.MyAdapter


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var userArrayList: ArrayList<Game>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val a = findViewById<Button>(R.id.profile)
        a.setOnClickListener(){
            val intent = Intent(this@MainActivity,ProfilActivity::class.java)
            startActivity(intent)
        }

        val imageId = intArrayOf(
            R.drawable.ml,R.drawable.pubg,R.drawable.coc,R.drawable.ac,R.drawable.dota,
            R.drawable.csgo,R.drawable.valo,R.drawable.dn
        )

        val name = arrayOf(
            "Mobile Legends", "PlayerUnknown Battlegrounds", "Clash of Clans", "Auto Chess", "Dota 2"
            , "Counter Strike Global Online", "Valorant", "Dragon Nest"
        )

        val jenisGame = arrayOf(
            "Multiplayer Online Battle Arena", "Battle Royale", "Real Time Strategy", "Role-Playing Game"
            , "Multiplayer Online Battle Arena", "First Person Shooter", "First Person Shooter", "Massively Multiplayer Online Role-Playing Game"
        )

        val deskripsi = arrayOf(
            "Mobile Legends: Bang Bang atau ML merupakan game MOBA yang dirilis oleh Moontoon. Game ini bisa dimainkan di ponsel Android maupun IOS. Dalam game MOBA ini akan ada 10 pemain yang akan dibagi menjadi 2 tim. Aturan mainnya yakni 5 vs 5. Rata-rata permainan dalam 1 game yakni sekitar 15-20 menit. Setiap pemain bisa memilih 1 hero dari puluhan daftar hero yang tersedia.",
            "PUBG ini merupakan salah satu permainan battle royale yang bisa dimainkan melalui handphone atau pc. Anda bisa mengajak teman untuk bergabung dalam tim atau menemui para pemain baru di dalam game saat sedang bermain. Game PUBG adalah game online yang disebarluaskan oleh Tencent, di mana jumlah orang yang melakukan unduhan mencapai seratus juta lebih. Sistem bermain PUBG ini last men standing, artinya pemain terakhir yang menang. Pemain itu harus lebih dulu bertahan hidup dari serangan pemain lain.",
            "Clash of Clans adalah permainan video strategi seluler freemium yang dikembangkan dan diterbitkan oleh pengembang permainan Finlandia, Supercell. Permainan ini dirilis untuk platform iOS pada 2 Agustus 2012, dan di Google Play untuk Android pada 7 Oktober 2013. Permainan ini berlatarkan tema fantasi dunia persistent dimana pemainnya adalah kepala desa. Clash of Clans menugaskan pemain untuk membangun desa mereka sendiri menggunakan sumber daya yang diperoleh dari menyerang desa pemain lain atau memproduksinya di desa sendiri. Untuk menyerang, pemain melatih berbagai jenis pasukan menggunakan sumber daya. Sumber daya utamanya adalah emas, elixir dan elixir hitam. Pemain dapat bergabung untuk membuat klan, grup hingga lima puluh orang, yang kemudian dapat berpartisipasi dalam Perang Klan bersama, menyumbang dan menerima pasukan, dan mengobrol satu sama lain.",
            "Auto Chess pada awalnya merupakan sebuah custom game dalam permainan Dota 2, dan juga seri terdahulunya di Warcraft 3. Namun siapa sangka, ide mini game tersebut justru menangkap perhatian Drodo Studio dan juga berhasil meyakinkan Dragonest dan Imba untuk berinvestasi mengembangkan game ini. Game bergenre auto-battler yang baru di rilis 31 Mei 2019 hingga saat ini telah berhasil menarik lebih dari 5 juta pengguna. Auto Chess menghadirkan gameplay yang inovatif dan ‘segar’ dengan tampilan interface yang menyenangkan.",
            "Dota 2 adalah sebuah permainan arena pertarungan daring multipemain, dan merupakan sekuel dari Defense of the Ancients mod pada Warcraft 3: Reign of Chaos dan Warcraft 3: The Frozen Throne. DotA 2 dikembangkan oleh Valve Corporation, terbit juli 2013 dota 2 dapat dimainkan secara gratis pada sistem operasi Microsoft Windows, OS X and Linux. Dota 2 dapat dimainkan secara eksklusif melalui distributor resmi valve, Steam. Dota 2 dimainkan oleh 2 tim yang beranggota 5 orang pemain, setiap tim memiliki markas yang berada dipojok peta, setiap markas memiliki satu bangunan bernama Ancient, Di mana tim harus berusaha menghancurkan Ancient tim lawan agar dapat memenangkan pertandingan. Setiap pemain hanya dapat mengontrol satu karakter Hero yang berfokus pada menaikan level, mengumpulkan gold, membeli item dan melawan tim lawan untuk menang.",
            "Counter Strike: Global Offensive adalah sebuah permainan dengan mode FPS yang dikembangkan oleh Valve Corporation dan Hidden Path Entertainment. Kedua perusahaan ini juga merupakan perusahaan yang mengembangkan Counter Strike: Source. Counter Strike: GO merupakan permainan keempat di dalam waralaba Counter Strike, tidak termasuk Counter Strike Neo dan Online. Counter Strike Global Offensive dirilis pada tanggal 21 Agustus, 2012 dan dapat dimainkan pada Microsoft Windows, OS X, Xbox Live Arcade dan Playstation Network versi Amerika. Counter Strike: Global Offensive menampilkan fitur-fitur klasiknya berupa peta yang ada dalam versi sebelumnya dan beberapa peta baru serta karakter tambahan. Permainan ini dapat dimainkan dengan menggunakan beberapa platform yang berbeda yaitu Windows, OS X dan PSN.",
            "Valorant adalah sebuah game FPS gratis yang dibuat oleh Riot Games untuk sistem operasi Windows. Dengan konsep yang mirip dengan CS:GO, permainan ini hadir dengan dua tim, yaitu lima lawan lima pemain. Bedanya, di Valorant setiap agent atau hero memiliki skill khusus untuk menambah serunya pertarungan. Dalam satu kali permainan, terdiri dari 24 ronde. Dengan masing-masing tim terbagi menjadi attacker dan defender. Attacker adalah tim yang bertugas untuk memasangkan bom. Sementara tim defender mempunyai tugas untuk mencegah hal tersebut terjadi. Oh iya, setelah berjalan 12 ronde, kedua tim akan bertukar peran.",
            "Dragon Nest adalah sebuah MMORPG fantasi bebas yang dikembangkan oleh Eyedentity. Permainan ini memakai sistem manual sehingga para pemainnya memegang kendali penuh atas setiap gerakan karakternya. Dragon Nest meminta para pemainnya memutakhirkan karakternya dengan membuat tim dan berkelana ke sejumlah penjara bawah tanah."
        )

        userArrayList = ArrayList()

        for(i in name.indices){
            val games = Game(name[i], jenisGame[i], deskripsi[i], imageId[i])
            userArrayList.add(games)
        }
        binding.listView.isClickable = true
        binding.listView.adapter = MyAdapter(this,userArrayList)
        binding.listView.setOnItemClickListener { parent, view, position, id ->
            val name = name[position]
            val deskripsi = deskripsi[position]
            val imageId = imageId[position]

            val i = Intent(this,GameActivity::class.java)
            i.putExtra("name",name)
            i.putExtra("deskripsi",deskripsi)
            i.putExtra("imageId",imageId)
            startActivity(i)
        }

    }
    }
