package com.example.myfoodapplication


object FoodData {
    private val foodNames = arrayOf(
        "Rendang Daging Sapi",
        "Pizza",
        "Ayam Kecap",
        "Nasi Goreng",
        "Nasi Pecel",
        "Burger",
        "Spaghetti Bolognese",
        "Coto Makassar",
        "Papeda",
        "Soto Banjar",
        "Bubur Ayam"
    )

    private val foodCountries = arrayOf(
        "Sumatera Barat",
        "Italia",
        "Asia Tenggara",
        "Indonesia",
        "Yogyakarta",
        "Amerika",
        "Italia",
        "Sulawesi Selatan",
        "Papua",
        "Kalimantan Selatan",
        "Indonesia"
    )

    private val foodDetails = arrayOf(
        "Rendang atau randang (Jawi: رندڠ) adalah masakan daging asli Indonesia yang berasal dari Minangkabau. Masakan ini dihasilkan dari proses memasak suhu rendah dalam waktu lama menggunakan aneka rempah-rempah dan santan. Proses memasaknya memakan waktu berjam-jam (biasanya sekitar empat jam) hingga yang tinggal hanyalah potongan daging berwarna hitam pekat dan dedak. Dalam suhu ruangan, rendang dapat bertahan hingga berminggu-minggu. Rendang yang dimasak dalam waktu yang lebih singkat dan santannya belum mengering disebut kalio, berwarna cokelat terang keemasan.",
        "Piza (menurut KBBI) (atau pizza) adalah hidangan gurih dari Italia sejenis adonan bundar dan pipih, yang dipanggang di oven dan biasanya dilumuri saus tomat serta keju dengan bahan makanan tambahan lainnya yang bisa dipilih. Keju yang dipakai biasanya mozzarella atau \"keju pizza\", bisa juga keju parmesan dan beberapa keju lainnya.",
        "Di Indonesia, ayam kecap adalah potongan ayam yang dilumuri dengan kecap manis, dibumbui dengan bawang merah atau bawang bombay, bawang merah, jahe, lada, bawang prei dan tomat.[1] Ragam lainnya menambahkan tambahan rempah-rempah, yang meliputi pala dan cengkih.[4]",
        "Nasi goreng merupakan sajian nasi yang digoreng dalam sebuah wajan atau penggorengan menghasilkan cita rasa berbeda karena dicampur dengan bumbu-bumbu seperti bawang putih, bawang merah, merica dan kecap manis. Selain itu, ditambahkan bahan-bahan pelengkap seperti telur, sayur-sayuran, makanan laut, atau daging. Makanan tersebut sering kali disantap sendiri atau disertai dengan hidangan lainnya.",
        "Pecel atau pecal adalah makanan yang menggunakan bumbu sambal kacang sebagai bahan utamanya yang dicampur dengan aneka jenis sayuran. Makanan ini populer terutama di wilayah DI Yogyakarta, Jawa Tengah, dan Jawa Timur. Asal kata dan daerah pecel belum diketahui secara pasti. Dalam bahasa Jawa, pecel dapat diartikan sebagai ‘tumbuk’ atau ‘dihancurkan dengan cara ditumbuk.",
        "Hamburger (atau sering kali disebut dengan burger) adalah sejenis makanan berupa roti berbentuk bundar yang diiris dua dan di tengahnya diisi dengan patty yang biasanya diambil dari daging, kemudian sayur-sayuran berupa selada, tomat dan bawang bombai. Sebagai sausnya, burger diberi berbagai jenis saus seperti mayones, saus tomat dan sambal serta mustard. Beberapa varian burger juga dilengkapi dengan keju, asinan, serta bahan pelengkap lain seperti sosis dan ham.[1]",
        "Spageti (nama resmi: Spaghetti ; pengucapan bahasa Italia: [spaˈɡetti]) adalah salah satu jenis pasta yang berbentuk panjang, tipis, silindris, dan padat, yang jika diperhatikan menyerupai mie pada umumnya.[1] Ini adalah makanan pokok dalam masakan Italia tradisional. Karena berbentuk seperti mie, kebanyakan orang menyebutnya mie dari Italia meskipun banyak varian pasta lainnya yang berbentuk seperti mie. Seperti pasta pada umumnya, spageti terbuat dari gandum giling dan air. Spageti Italia terbuat dari semolina gandum durum, tetapi di tempat lain bisa dibuat dengan tepung jenis lain.[2]",
        "Coto makassar atau coto mangkasara adalah makanan tradisional Makassar, Sulawesi Selatan.[1] Makanan ini terbuat dari jeroan sapi yang direbus dalam waktu yang lama. Rebusan jeroan bercampur daging sapi ini kemudian diiris-iris lalu dibumbui dengan bumbu yang diracik secara khusus. Coto dihidangkan dalam mangkuk dan dinikmati dengan ketupat dan buras, yakni sejenis ketupat yang dibungkus daun pisang.",
        "Papeda adalah makanan berupa bubur sagu khas Maluku dan Papua yang biasanya disajikan dengan ikan tongkol atau mubara yang dibumbui dengan kunyit.[1] Papeda berwarna putih dan bertekstur lengket menyerupai lem dengan rasa yang tawar.[1] Papeda merupakan makanan yang kaya serat, rendah kolesterol, dan cukup bernutrisi.[2]",
        "Soto Banjar adalah soto khas suku Banjar, Kalimantan Selatan dengan bahan utama ayam serta memiliki aroma harum rempah-rempah seperti kayu manis, biji pala, dan cengkih. Adakalanya pembuatan kuah soto banjar dapat dicampurkan dengan sedikit susu yang membuat warna kuahnya mejadi tidak bening, tetapi sedikit keruh. Soto ini berisi daging ayam yang sudah disuwir-suwir, dengan tambahan perkedel, kentang rebus, rebusan telur, potongan wortel dan ketupat.[1]",
        "Bubur ayam adalah salah satu jenis makanan bubur dari Indonesia. Bubur nasi adalah beras yang dimasak dengan air yang banyak sehingga memiliki tekstur yang lembut dan berair. Bubur biasanya disajikan dalam suhu panas atau hangat. Bubur ayam disajikan dengan irisan daging ayam dengan beberapa bumbu, seperti kecap asin dan kecap manis, merica, garam, dan kadang-kadang diberi kaldu ayam. Bubur dilengkapi dengan taburan daun bawang cincang, bawang goreng, seledri, tongcai (sayur asin), kedelai goreng, cakwe, dan kerupuk. Bubur ayam cocok bagi mereka yang kurang menyukai masakan Indonesia yang pedas, karena bubur umumnya tidak pedas; sambal atau saus cabe disajikan secara terpisah."
    )

    private val foodRecipes = arrayOf(
        "1. Haluskan semua bahan Bumbu dengan diulek atau diblender.\n\n" +
                "2. Tumis bumbu dengan sedikit minyak goreng hingga wangi.\n\n" +
                "3. Masukkan batang serai, daun jeruk, asam kandis dan garam, aduk rata.\n\n" +
                "4. Tuangi santan dan dididihkan, masukkan daging.\n\n" +
                "5. Masak dengan api kecil selama beberapa jam sampai daging empuk dan bumbu kecokelatan sesuai selera.",
        "1. Campur ragi dengan air hangat sampai berbuih. Lalu dimasukkan ke bahan adonan.\n\n" +
                "2. Campur seluruh bahan untuk adonan. Uleni sampai menyatu dan tidak lengket.\n\n" +
                "   Tips: tambahkan minyak sayur bila masih agak lengket. Dan apabila masih terlalu cair ditambahkan tepung sedikit demi sedikit\n\n" +
                "4. Setelah adonan tercampur dan tidak lengket, diamkan 30 menit sampai mengembang.\n\n" +
                "5. Setelah 30 menit, adonan diletakkan di loyang dan digiling tipis lalu beri saus dan topping sesuai selera.\n\n" +
                "6. Masukkan ke oven rak tengah, atur api atas dan bawah 180 derajat selama 20 menit.\n\n" +
                "7. Pizza homemade siap dinikmati! ",
        "1. Cuci bersih ayam lalu tiriskan. Perciki air jeruk nipis dan lumuri dengan garam hingga merata lalu diamkan sebentar.\n\n" +
                "2. Panaskan minyak banyak di atas api sedang, goreng potongan ayam hingga kuning kecokelatan. Angkat dan tiriskan.\n\n" +
                "3. Lelehkan mentega dalam wajan, tumis bawang bombay hingga layu.\n\n" +
                "4. Tambahkan bawang putih, jahe dan daun bawang, teruskan menumis hingga layu dan warnanya kecokelatan.\n\n" +
                "5. Bumbui dengan kecap Inggris dan kecap manis, merica dan garam, aduk rata lalu tuangi air.\n\n" +
                "6. Masukkan ayam yang sudah digoreng dan kecilkan api.\n\n" +
                "7. Masak terus hingga bumbu meresap dan kuahnya sedikit kental.\n\n" +
                "8. Angkat, taburi bawang goreng. Sajikan hangat.",
        "1. Panaskan minyak, tumis bumbu halus hingga wangi.\n\n" +
                "2. Kocok telur hingga rata. Tuangkan ke dalam bumbu. Aduk rata.\n\n" +
                "3. Masukkan nasi, ayam suwir, kaldu bubuk, kecap manis dan merica.\n\n" +
                "4. Aduk-aduk hingga seluruhnya tercampur rata dan agak kering.\n\n" +
                "5. Angkat dan sajikan dengan Pelengkapnya.\n\n" +
                "6.Sajian untuk 4 porsi.",
        "1. Sangrai kacang tanah dengan api sedang sambil terus diaduk selama 30 menit. Pastikan kacang tidak gosong dan angkat setelah benar-benar matang. Kemudian haluskan kacang menggunakan blender atau food processor hingga halus, sisihkan.\n\n" +
                "2. Sangrai semua bahan bumbu halus sambil terus diaduk hingga matang. Tambahkan daun jeruk dan sangrai selama 1 menit saja. Setelah diangkat, haluskan bahan-bahan ini menggunakan cobek atau blender. Tambahkan gula merah dan asam jawa, kemudian aduk kembali hingga rata.\n\n" +
                "3. Campur bumbu dengan kacang tanah yang telah dihaluskan menggunakan spatula.\n\n" +
                "4. Cicipi dengan cara melarutkan 1 sdm sambal pecel menggunakan sedikit air untuk memastikan rasanya telah benar-benar pas. Jika sudah, masukkan sambal dalam wadah tertutup rapat dan simpan di dalam kulkas. Mama bisa mengambil seperlunya saat akan disantap.\n\n" +
                "5. Rebus semua sayuran secara terpisah. Kemudian, angkat dan tiriskan setelah benar-benar matang.\n\n" +
                "6. Letakkan sayur tersebut di atas piring saji, siram dengan sambal pecel yang telah dilarutkan. Hidangkan bersama bahan pelengkap, nasi putih, tempe goreng, telur ceplok, dan rempeyek.",
        "1. Panaskan minyak atau margarin di atas permukaan wajan datar. Lalu masak daging burger hingga matang. Daging burger perlu dibolak-balik agar kedua sisinya matang merata. Usahakan memasaknya tidak sampai terlalu kering agar daging burger tetap terasa juicy.\n\n" +
                "2. Setelah matang, sisihkan daging burger.\n\n" +
                "3. Siapkan isian burger lainnya, yakni daun selada dan tomat yang telah dicuci bersih. Lalu iris-iris tomat.\n\n" +
                "4. Siapkan piring saji, lalu belah roti burger dan isi dengan daging burger, daun selada, keju lembaran, dan irisan tomat dengan posisi tertumpuk.\n\n" +
                "5. Tambahkan mayonnaise dan saus sambal botolan sesuai selera.",
        "1. Didihkan air, garam, dan minyak. Masukkan spaghetti, rebus hingga lunak. Angkat dan tiriskan. Sisihkan.\n\n" +
                "2. Saus: Panaskan mentega hingga leleh. Tumis bawang Bombay dan bawang putih hingga layu.\n\n" +
                "3. Masukkan daging cincang. Aduk hingga berubah warna.\n\n" +
                "4. Masukkan bahan lainnya. Masak hingga kental. Angkat.\n\n" +
                "5. Taruh spaghetti di piring saji. Tuangi Sausnya.\n\n" +
                "6. Taburi keju Parmesan parut. Sajikan hangat.",
        "1. Rebus daging dengan air sampai matang. \n\n" +
                "2. Potong-potong daging dan saring kaldu.\n\n" +
                "3. Didihkan kembali.\n\n" +
                "4. Masukkan daging, hati sapi, babat, paru, dan lidah, lalu didihkan.\n\n" +
                "5. Panaskan minyak.\n\n" +
                "6. Tumis bumbu halus, kayu manis, serai, dan taoco sampai harum, lalu tuang ke rebusan daging.\n\n" +
                "7. Masukkan garam dan gula pasir. Masak sampai matang.\n\n" +
                "8. Siapkan mangkuk saji. \n\n" +
                "9. Hidangkan dengan seledri dan bawang goreng.",
        "1. Panaskan kompor dan didihkan 3 gelas air dalam sebuah panci.\n\n" +
                "2. Haluskan bawang putih, menggunakan blender bumbu atau ulek.\n\n" +
                "3. Campurkan tepung sagu, bawang putih halus, garam, dan juga bumbu penyedap dalam satu wadah. Tambahkan satu gelas air dan aduk hingga semua bahan tercampur secara merata.\n\n" +
                "4. Apabila air yang dididihkan dalam panci telah panas, masukkan air tersebut ke dalam tepung sagu perlahan.\n\n" +
                "5. Masak kembali tepung sagu yang telah dicampur dengan air panas pada kompor dengan api kecil. Aduk tepung sagu dalam panci hingga tekstur berubah menjadi kental lalu angkat.\n\n" +
                "6. Papeda khas Papua bisa langsung kamu nikmati. Agar cita rasa papeda dapat semakin lezat, kamu bisa menambahkan bumbu kuning saat menikmatinya.",
        "1. Belah ayam menjadi 4 bagian, lalu rebus dengan air bersama kayu manis, kapulaga, cengkih, pala, dan pekak. Rebus hingga ayam empuk, angkat, dinginkan.\n\n" +
                "\n" +
                "2. Saring kaldunya sebanyak 1.250 ml, lalu jerang kembali di atas api. Suwir-suwir daging ayam, buang tulangnya, sisihkan.\n" +
                "\n" +
                "3. Panaskan minyak goreng dalam wajan, tumis bumbu halus hingga harum, angkat. \n" +
                "\n" +
                "4. Masukkan bumbu tumis ke dalam panci kaldu, masak hingga mendidih dan bau langu bumbu hilang, angkat.\n" +
                "\n" +
                "5. Penyajian: Masukkan ketupat, suun, telur, dan perkedel dalam mangkuk. Tuang kuah ayam panas, taburi bawang goreng dan seledri iris. Sajikan hangat dengan pelengkap  jeruk nipis dan sambal cabai halus. (P)",
"1. Didihkan air, daun salam dan garam.\n\n" +
        "2. Masukkan beras, masak hingga beras mengembang dan lunak.\n\n" +
        "3. Masak terus hingga beras menjadi kental dan lembut lalu angkat.\n\n" +
        "4. Ayam Tumis:\n\n" +
        "5. Panaskan minyak sayur dan minyak wijen hingga wangi.\n\n" +
        "6. Tumis bawang putih hingga wangi.\n\n" +
        "7. Masukkan ayam, aduk hingga warnanya putih dan kaku.\n\n" +
        "8. Masukkan potongan jamur, aduk hingga layu.\n\n" +
        "9. Tambahkan saus tiram, kecap, merica dan air.\n\n" +
        "10. Didihkan hingga matang dan agak kering lalu angkat.\n\n" +
        "11. Taruh bubur dalam mangkuk saji.\n\n" +
        "12. Beri Ayam Tumis dan Pelengkapnya.\n\n" +
        "13 Sajikan hangat."
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
                "Acar mentimun\n",
        "1 kg kacang tanah\n" +
                "1 sdm air asam jawa\n" +
                "500 gr gula merah atau gula kepala, sisir halus\n" +
                "12 lembar daun jeruk, iris halus\n" +
                "5 siung bawang putih\n" +
                "100 gr cabai merah atau cabai keriting\n" +
                "50 gr cabai rawit merah atau sesuai selera\n" +
                "6 cm kencur, kupas hingga bersih\n" +
                "2 sdm garam atau sesuai selera\n" +
                "250 gr kangkung, potong dan cuci hingga bersih\n" +
                "150 gr taoge, buang akarnya dan cuci bersih\n" +
                "250 gr kacang panjang, potong seukuran 3 cm\n" +
                "Nasi putih\n" +
                "Telur ceplok\n" +
                "Tempe goreng\n" +
                "Rempeyek kacang\n",
        "Roti burger sejumlah 2 buah\n" +
                "Daging burger sapi sejumlah 6 lembar\n" +
                "Daun selada sejumlah 2 lembar\n" +
                "Keju lembaran sejumlah 4 lembar\n" +
                "Tomat sejumlah 1 buah\n" +
                "Mayonnaise secukupnya\n" +
                "Saus sambal botolan secukupnya\n" +
                "Minyak goreng atau margarin kurang lebih sebanyak 1 sendok teh",
        "2 liter air\n" +
                "1 sdt minyak sayur\n" +
                "1 sdt garam\n" +
                "1 bungkus (225 g) spaghetti kering\n" +
                "2 sdm keju Parmesan parut\n" +
                "2 sdm mentega\n" +
                "50 g bawang Bombay, cincang\n" +
                "1 siung bawang putih, cincang\n" +
                "200 g daging sapi cincang\n" +
                "500 g tomat merah, parut\n" +
                "1 sdt tomat pasta\n" +
                "1/2 sdt oragano\n" +
                "1/2 sdt merica bubuk\n" +
                "1 sdt gula pasir\n" +
                "1 sdt garam",
        "150 gram daging sandung lamur\n" +
                "1.500 ml air\n" +
                "50 gram hati sapi, direbus, potong kotak\n" +
                "100 gram babat, rebus, potong kotak\n" +
                "50 gram paru, rebus, potong kotak\n" +
                "50 gram lidah, rebus, potong kotak\n" +
                "3 cm kayu manis\n" +
                "2 batang serai, ambil putihnya, memarkan\n" +
                "2 sdm taoco\n" +
                "2 sdt garam\n" +
                "1/2 sdm gula pasir\n" +
                "3 sdm minyak untuk menumis\n" +
                "2 sdm makan bawang goreng\n" +
                "2 tangkai seledri, diiris halus\n" +
                "8 butir bawang merah\n" +
                "5 siung bawang putih\n" +
                "2 cm jahe\n" +
                "1/2 sdt ketumbar bubuk\n" +
                "1/2 sdt jintan bubuk\n" +
                "50 gram kacang tanah tanpa kulit, sangrai",
        "Tepung sagu 250 gram\n" +
                "Bawang putih 2 siung\n" +
                "Air 2 liter (4 gelas)\n" +
                "Garam secukupnya\n" +
                "Bumbu penyedap secukupnya",
        "ekor (600 g) ayam kampung\n" +
                "2.000 ml air\n" +
                "5 cm kayu manis\n" +
                "4 butir kapulaga\n" +
                "3 butir cengkih\n" +
                "1 buah biji pala, belah\n" +
                "2 butir pekak\n" +
                " 4 sdm minyak goreng\n" +
                " \n" +
                "Bumbu halus\n" +
                "8 butir bawang merah\n" +
                "4 siung bawang putih\n" +
                "1 cm kunyit\n" +
                "3 butir kemiri sangrai\n" +
                "½ sdt merica bubuk\n" +
                "1½ sdt garam\n" +
                " \n" +
                "Pelengkap\n" +
                "4 buah ketupat, potong-potong\n" +
                "100 g suun rebus\n" +
                "2 butir telur rebus, belah-belah\n" +
                "4 buah perkedel kentang\n" +
                " 2 sdm bawang goreng\n" +
                "2 sdm seledri iris\n" +
                "jeruk nipis iris\n" +
                "sambal cabai rebus",
        "150 g beras pulen, cuci bersih\n" +
                "1.5 liter air\n" +
                "2 lembar daun salam\n" +
                "2 sdt garam\n" +
                "Ayam Tumis:\n" +
                "1 sdm minyak sayur\n" +
                "½ sdt minyak wijen\n" +
                "1 siung bawang putih, cincang halus\n" +
                "1 batang daun bawang, iris kasar\n" +
                "250 g daging ayam, cincang kasar\n" +
                "100 g jamur merang, iris kasar\n" +
                "2 sdm saus tiram\n" +
                "2 sdm kecap asin\n" +
                "1 sdm kecap manis\n" +
                "½ sdt merica bubuk\n" +
                "150 ml air\n" +
                "Pelengkap:\n" +
                "Kulit pangsit goreng\n" +
                "bawang merah goreng\n" +
                "Kaldu ayam"

        )
    private val foodImages = intArrayOf(
        R.drawable.rendang1,
        R.drawable.pizza1,
        R.drawable.ayam_kecap1,
        R.drawable.nasi_goreng,
        R.drawable.nasi_pecel,
        R.drawable.burger,
        R.drawable.spaghetti,
        R.drawable.coto_makassar,
        R.drawable.papeda,
        R.drawable.soto_banjar,
        R.drawable.bubur_ayam
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