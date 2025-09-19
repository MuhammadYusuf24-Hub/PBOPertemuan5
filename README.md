# PBOPertemuan5
Dalam era digital saat ini, kebutuhan akan aplikasi berbasis data semakin meningkat. Aplikasi modern tidak hanya menampilkan informasi, tetapi juga memungkinkan pengguna untuk melakukan pengelolaan data secara langsung melalui antarmuka grafis yang interaktif.
Java, sebagai bahasa pemrograman berorientasi objek, menyediakan dukungan lengkap untuk pembuatan aplikasi GUI (Graphical User Interface) dengan menggunakan JFrame Form. Di sisi lain, pengelolaan data dapat dilakukan dengan menghubungkan Java ke PostgreSQL melalui JDBC (Java Database Connectivity).

Untuk menjaga agar sistem lebih terstruktur, dibutuhkan class koneksi khusus yang menangani koneksi ke database, serta class exception yang mengelola penanganan error agar program lebih aman dan tidak langsung terhenti saat terjadi kesalahan. Dengan demikian, integrasi antara Java, PostgreSQL, JFrame Form, class koneksi, dan class exception dapat menghasilkan aplikasi yang modular, interaktif, serta mudah dikembangkan.

# PostgreSQL
PostgreSQL adalah sistem manajemen basis data relasional open-source yang handal dan mendukung SQL standar. PostgreSQL sering digunakan untuk aplikasi berskala kecil hingga besar karena kestabilannya.
1. Java Database Connectivity (JDBC)
JDBC adalah API yang memungkinkan Java berkomunikasi dengan database. Dengan JDBC, Java dapat melakukan operasi CRUD (Create, Read, Update, Delete).  
2. JFrame Form (Swing)
Swing adalah library GUI di Java yang memungkinkan pembuatan aplikasi desktop dengan komponen seperti tombol, tabel, dan form input.  
3. Class Koneksi
Class ini dibuat untuk mengatur koneksi aplikasi dengan database PostgreSQL agar lebih terstruktur dan mudah dipanggil kembali.  
4. Class Exception
Exception adalah mekanisme penanganan error di Java. Dengan membuat class exception khusus, aplikasi bisa menampilkan pesan error yang lebih informatif tanpa langsung menutup program.

# Struktur Frame "DATA MINUMAN"

1. Judul Frame
Label besar di bagian atas: DATA MINUMAN

2. Form Input (Panel Kiri)  

Label dan Text Field:

ID : JTextField

Nama : JTextField

Kategori : JComboBox (isi: Kopi, Teh, Matcha, dll.)

Harga : JTextField

Ukuran : JComboBox (isi: S, M, L)

3. Tombol Aksi (Panel Tengah-Bawah)  

JButton Insert → menambah data baru ke database dan tabel.

JButton Update → memperbarui data yang dipilih di tabel.

JButton Delete → menghapus data yang dipilih di tabel.

JButton Clear → mengosongkan semua field input.

4. Tabel Data (Panel Kanan)  

JTable dengan kolom:

ID

Nama

Kategori

Harga

Ukuran
