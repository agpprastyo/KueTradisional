package com.example.kuetradisional

object KueData {
    private val kueNames = arrayOf(
        "Pastel",
        "Lemper",
        "Getuk",
        "Lupis",
        "Gemblong",
        "Pancong",
        "Kue Lumpur",
        "Onde-Onde",
        "Klepon",
        "Dodol"
    )

    private val kueDetails = arrayOf(
        "Kue tradisional Indonesia yang satu ini tentu tak asing lagi di telinga. Pastel adalah salah satu jajanan yang menjadi favorit banyak orang karena rasanya yang gurih dan renyah. Bentuknya seperti bantal setengah lingkaran dengan isi bermacam-macam seperti sayuran, daging, dan telur. \n" +
                "\n" +
                "Kudapan khas Indonesia ini terinspirasi oleh makanan khas Belanda. Bentuknya mirip dengan Panada asal Manado, yang merupakan kuliner yang diadaptasi dari kuliner khas Spanyol.",
        "Lemper adalah kue tradisional Indonesia yang terbuat dari ketan beras dengan isi suwiran daging ayam. Ketan beras berisi ini kemudian dibalut dengan daun pisang. Rasanya agak asin dan aroma daun pisangnya sangat khas. Lemper sangat banyak disukai orang sehingga bisa dibilang menjadi salah satu makanan standar yang ada di dalam box pada acara selamatan.",
        "Getuk adalah singkong yang dikukus, kemudian digulung atau ditumbuk hingga halus. Biasanya kue tradisional Indonesia ini sudah dipotong kotak-kotak dengan bentuk antara persegi atau seperti mie yang dipotong kotak. Sebagai pelengkap, kamu bisa menikmatinya dengan menuang gula merah atau menabur parutan kelapa. Ada beberapa jenis getuk seperti lindri, getuk trio, dan getuk gulung.",
        "Tahukah kamu, kue tradisional Indonesia ada yang bisa menjadi pengganti makan berat? Ya, kue lupis yang terkenal di Pulau Jawa ini bisa dijadikan pengganti sarapan bagi kamu yang buru-buru beraktivitas namun tidak sempat mengisi perut. Kue ini cukup mengenyangkan karena terbuat dari beras ketan dan memiliki rasa gurih-manis. Paling nikmat menyantap kue lupis selagi hangat sambil menyesap teh hangat.",
        "Bagi kamu yang suka manis, pasti akan suka dengan kue tradisional Indonesia yang satu ini. Gemblong terbuat dari kelapa dan tepung ketan yang dicampur dan dibentuk bulat agak pipih, lalu dilapisi dengan karamel. Gemblong paling banyak ditemui di Jawa Barat, tepatnya di daerah Puncak, dan disarankan untuk menikmatinya selagi hangat.",
        "Beruntunglah bagi kamu yang tinggal di Jakarta, karena kue tradisional Indonesia khas Betawi ini bisa dengan mudah kamu temukan di pedagang kaki lima. Kue pancong terbuat dari adonan santan dan tepung beras yang dipanggang di dalam cetakan khusus. Rasanya gurih dan bisa ditaburi gula untuk memberikan citarasa manis. Kue pancong paling nikmat dimakan selagi hangat.",
        "Kue tradisional Indonesia yang satu ini sangat populer, tak hanya ditemukan di pasar tradisional namun juga di pasar modern. Kue lumpur yang memiliki tekstur lembut dan kenyal ini terbuat dari tepung terigu, telur, santan, kentang, lalu ditambah vanila dan diberi kismis di atasnya. Rasanya manis sehingga mudah dinikmati oleh banyak orang.",
        "Onde-Onde terbuat dari adonan tepung ketan berbentuk bola dengan isi pasta kacang hijau, yang kemudian ditaburi wijen dan digoreng. Kamu bisa merasakan gurih, asin, dan manis dalam setiap gigitan. Kue tradisional yang satu ini bisa dengan mudah kamu temukan di pedagang kaki lima.\n" +
                "\n" +
                "Kue tradisional Indonesia yang satu ini merupakan adaptasi dari kuliner Tiongkok yang sudah ada dari zaman Tang di daerah Xi'an. Kemudian disebar luaskan ke daerah selatan Tiongkok lalu Asia Tenggara dan sampai ke Indonesia.",
        "Kue tradisional ini berbentuk bulat kecil, terbuat dari adonan tepung beras yang diisi dengan gula aren. Setelah itu, adonannya yang lengket akan di taburi dengan parutan kelapa. Rasanya sangat manis. Pada awalnya klepon sering disajikan di acara selamatan, namun kue ini kini juga bisa ditemukan di kafe yang fancy sebagai kue tradisional Indonesia untuk teman minum teh",
        "Dodol adalah kue tradisional Indonesia yang punya tekstur padat dengan rasa yang manis. Kue ini terbuat dari tepung ketan, gula merah, santan kelapa, gula pasir, dan garam. Dodol dikenal dengan nama jenang di Jawa Tengah dan Jawa Timur. Di daerah lain yang membuat dodol dengan durian biasanya menyebut nama kue tradisional ini sebagai lempok. Konon kue tradisional Indonesia yang ini sudah dibuat dan disantap dari sejak abad ke-9."
    )

    private val kueImages = arrayOf(
        R.drawable.apastel,
        R.drawable.blemper,
        R.drawable.cgetuk,
        R.drawable.dlupis,
        R.drawable.egemblong,
        R.drawable.fpancong,
        R.drawable.gkuelumpur,
        R.drawable.hondeonde,
        R.drawable.iklepon,
        R.drawable.jdodol
    )

    val listData: ArrayList<MacamKue>
        get() {
            val list = arrayListOf<MacamKue>()
            for (position in kueNames.indices) {
                val kue = MacamKue()
                kue.name = kueNames[position]
                kue.detail = kueDetails[position]
                kue.photo = kueImages[position]
                list.add(kue)
            }
            return list
        }
}