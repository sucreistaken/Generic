# Generic Bu sınıfın amacı dinamik bir Dizi tutması ve veri tipini dinamik olarak almasıdır. Dolayısıyla bu sınıf generic bir dizi sınıfıdır.
 *
 * Sınıf Özellikleri;
 *
 * 1 - Sınıf içerisindeki dizinin varsayılan boyutu 10 ve dizinin eleman sayısı ihtiyaç duydukça 2 katı şeklinde artmaktadır. [OK]
 * 2 - Sınıfa ait iki tür constructor bulunmalıdır. [OK]
 * 3 - MyList boş constructor kullanılırsa dizinin başlangıç boyutu 10 olmalıdır. [OK]
 * 4 - MyList(int capacity) dizinin başlangıç değeri capacity parametresinden alınmalıdır. [OK]
 * 5 - size() dizideki eleman sayısını verir. [OK]
 * 6 - getCapacity() dizinin kapasite değerini verir. [OK]
 * 7 - add(T data) sınıfa ait diziye eleman eklemek için kullanılmalıdır. Eğer dizide yeteri kadar yer yoksa dizi boyutu iki katına çıkarılmalıdır. [OK]
 *
 * 8 - get(int index) verilen indisteki değeri döndürür. Geçersiz indis girilirse null döndürür. [OK]
 * 9 - remove(int index) verilen indisteki değeri silip, değerleri sola doğru kaydırır. Geçersiz indis girilirse null döndürür. [OK]
 * 10 - set(int index, T data) verilen indisteki değeri gönderilen veri ile değiştirir. Geçersiz indis girilirse null döndürür. [OK]
 * 11 - String toString() Sınıfa ait dizideki elemanları listeleyen metod.  [OK]
 *
 * 12 - int indexOf(T data) : Parametrede verilen nesnenin listedeki indexini verir. Nesne listede yoksa -1 değerini verir. [OK]
 * 13 - int lastIndexOf(T data) : Parametrede verilen nesnenin listedeki son indexini verir. Nesne listede yoksa -1 değerini verir. [OK]
 * 14 - boolean isEmpty() : Listenin boş olup olmadığını true ya da false değeri döndürerek bildirir. [OK]
 * 15 - T[] toArray(): Listedeki öğeleri aynı sırayla bir dizi haline getirip geriye döndürür. Yalnızca elemanları içeren bir dizi. [OK]
 * 16 - clear() : Listedeki bütün öğeleri siler, boş bir liste haline getirir. [OK]
 * 17 - MyList<T> sublist(int start, int finish) : Parametrede verilen index aralığına ait bir liste döner. [OK]
 * 18 - boolean contains(T data) : Parametrede verilen değerin listede olup olmadığını söyler. [OK]
