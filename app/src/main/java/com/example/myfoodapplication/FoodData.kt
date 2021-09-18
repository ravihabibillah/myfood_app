package com.example.myfoodapplication


object FoodData {
    private val foodNames = arrayOf(
        "Rendang Daging Sapi",
        "Pizza",
        "Ayam Kecap",
        "Nasi Goreng",
//        "Nasi Pecel",
//        "Burger",
//        "Spaghetti Bolognese",
//        "Coto Makassar",
//        "Papeda",
//        "Soto Banjar",
//        "Bubur Ayam"
    )

    private val foodCountries = arrayOf(
        "Sumatera Barat",
        "Italia",
        "Asia Tenggara",
        "Indonesia",
//        "Yogyakarta",
//        "Amerika",
//        "Italia",
//        "Sulawesi Selatan",
//        "Papua",
//        "Kalimantan Selatan",
//        "Indonesia"
    )

    private val foodDetails = arrayOf(
        "Rendang atau randang (Jawi: رندڠ) adalah masakan daging asli Indonesia yang berasal dari Minangkabau. Masakan ini dihasilkan dari proses memasak suhu rendah dalam waktu lama menggunakan aneka rempah-rempah dan santan. Proses memasaknya memakan waktu berjam-jam (biasanya sekitar empat jam) hingga yang tinggal hanyalah potongan daging berwarna hitam pekat dan dedak. Dalam suhu ruangan, rendang dapat bertahan hingga berminggu-minggu. Rendang yang dimasak dalam waktu yang lebih singkat dan santannya belum mengering disebut kalio, berwarna cokelat terang keemasan.",
        "Piza (menurut KBBI) (atau pizza) adalah hidangan gurih dari Italia sejenis adonan bundar dan pipih, yang dipanggang di oven dan biasanya dilumuri saus tomat serta keju dengan bahan makanan tambahan lainnya yang bisa dipilih. Keju yang dipakai biasanya mozzarella atau \"keju pizza\", bisa juga keju parmesan dan beberapa keju lainnya.",
        "Di Indonesia, ayam kecap adalah potongan ayam yang dilumuri dengan kecap manis, dibumbui dengan bawang merah atau bawang bombay, bawang merah, jahe, lada, bawang prei dan tomat.[1] Ragam lainnya menambahkan tambahan rempah-rempah, yang meliputi pala dan cengkih.[4]",
        "Nasi goreng merupakan sajian nasi yang digoreng dalam sebuah wajan atau penggorengan menghasilkan cita rasa berbeda karena dicampur dengan bumbu-bumbu seperti bawang putih, bawang merah, merica dan kecap manis. Selain itu, ditambahkan bahan-bahan pelengkap seperti telur, sayur-sayuran, makanan laut, atau daging. Makanan tersebut sering kali disantap sendiri atau disertai dengan hidangan lainnya.",

        )

    private val foodRecipes = arrayOf(
        "1. Haluskan semua bahan Bumbu dengan diulek atau diblender.\n" +
                "2. Tumis bumbu dengan sedikit minyak goreng hingga wangi.\n" +
                "3. Masukkan batang serai, daun jeruk, asam kandis dan garam, aduk rata.\n" +
                "4. Tuangi santan dan dididihkan, masukkan daging.\n" +
                "5. Masak dengan api kecil selama beberapa jam sampai daging empuk dan bumbu kecokelatan sesuai selera.",
        "1. Campur ragi dengan air hangat sampai berbuih. Lalu dimasukkan ke bahan adonan.\n" +
                "2. Campur seluruh bahan untuk adonan. Uleni sampai menyatu dan tidak lengket.\n" +
                "   Tips: tambahkan minyak sayur bila masih agak lengket. Dan apabila masih terlalu cair ditambahkan tepung sedikit demi sedikit\n" +
                "4. Setelah adonan tercampur dan tidak lengket, diamkan 30 menit sampai mengembang.\n" +
                "4. Setelah 30 menit, adonan diletakkan di loyang dan digiling tipis lalu beri saus dan topping sesuai selera.\n" +
                "5. Masukkan ke oven rak tengah, atur api atas dan bawah 180 derajat selama 20 menit.\n" +
                "6. Pizza homemade siap dinikmati! ",
        "1. Cuci bersih ayam lalu tiriskan. Perciki air jeruk nipis dan lumuri dengan garam hingga merata lalu diamkan sebentar.\n" +
                "2. Panaskan minyak banyak di atas api sedang, goreng potongan ayam hingga kuning kecokelatan. Angkat dan tiriskan.\n" +
                "3. Lelehkan mentega dalam wajan, tumis bawang bombay hingga layu.\n" +
                "4. Tambahkan bawang putih, jahe dan daun bawang, teruskan menumis hingga layu dan warnanya kecokelatan.\n" +
                "5. Bumbui dengan kecap Inggris dan kecap manis, merica dan garam, aduk rata lalu tuangi air.\n" +
                "6. Masukkan ayam yang sudah digoreng dan kecilkan api.\n" +
                "7. Masak terus hingga bumbu meresap dan kuahnya sedikit kental.\n" +
                "8. Angkat, taburi bawang goreng. Sajikan hangat.",
        "1. Panaskan minyak, tumis bumbu halus hingga wangi.\n" +
                "2. Kocok telur hingga rata. Tuangkan ke dalam bumbu. Aduk rata.\n" +
                "3. Masukkan nasi, ayam suwir, kaldu bubuk, kecap manis dan merica.\n" +
                "4. Aduk-aduk hingga seluruhnya tercampur rata dan agak kering.\n" +
                "5. Angkat dan sajikan dengan Pelengkapnya.\n" +
                "6.Sajian untuk 4 porsi."
    )

    private val foodTools = arrayOf(
        "1 kg daging sapi\n" +
                "3 butir kelapa, diambil santan kental dan santan encernya\n" +
                "4 lembar daun jeruk\n" +
                "3 batang serai, memarkan\n" +
                "4 butir asam kandis\n" +
                "100 ml minyak goreng\n" +
                "5 gram garamBumbu rendang daging sapi 1 Kg:\n" +
                "60 gram bawang merah\n" +
                "50 gram bawang putih\n" +
                "250 gram cabai merah besar\n" +
                "100 gram lengkuas\n" +
                "50 gram kemiri\n" +
                "2 gram cengkeh",
        "200 gram (gr) tepung terigu \n" +
                "1 sendok teh (sdt) ragi (fermipan) \n" +
                "1 butir telur\n" +
                "Garam dan air secukupnya\n" +
                "2 sdm saus tomat\n" +
                "2 sdm saus bolognaise",
        "1 ekor ayam negeri, potong 8-12 bagian\n" +
                "1 buah jeruk nipis\n" +
                "2 sdt garam\n" +
                "minyak goreng\n" +
                "Bumbu:\n" +
                "2 sdm mentega\n" +
                "1 butir bawang bombay, belah dua, iris melintang tipis\n" +
                "3 siung bawang putih, memarkan\n" +
                "1/2 cm jahe, iris tipis\n" +
                "1 batang daun bawang, iris kasar\n" +
                "2 sdm kecap Inggris\n" +
                "4 sdm kecap manis\n" +
                "300 ml air\n" +
                "1/2 sdt merica bubuk\n" +
                "2 sdt garam",
        "500 g nasi\n" +
                "3 sdm minyak sayur\n" +
                "150 g daging ayam goreng suwir\n" +
                "3 sdm kecap manis\n" +
                "2 butir telur ayam\n" +
                "1 sdm kaldu bubuk non MSG\n" +
                "1/2 sdt merica bubuk\n" +
                "Haluskan:\n" +
                "5 butir bawang merah\n" +
                "3 siung bawang putih\n" +
                "3 buah cabe merah\n" +
                "2 sdt terasi goreng\n" +
                "2 sdt garam\n" +
                "Pelengkap:\n" +
                "Keurupuk kanji\n" +
                "Acar mentimun\n"
    )
    private val foodImages = intArrayOf(
        R.drawable.rendang,
        R.drawable.ayam_kecap,
        R.drawable.pizza,
        R.drawable.nasi_goreng
    )
    val listData: ArrayList<Food>
        get() {
            val list = arrayListOf<Food>()
            for (position in foodNames.indices) {
                val food = Food()
                food.name = foodNames[position]
                food.country = foodCountries[position]
                food.detail = foodDetails[position]
                food.photo = foodImages[position]
                food.tools = foodTools[position]
                food.recipe = foodRecipes[position]
                list.add(food)
            }
            return list
        }


}