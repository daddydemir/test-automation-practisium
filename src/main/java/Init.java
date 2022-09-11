public class Init{

    public static void main(String[] args) throws InterruptedException {
        Boolean data = StartTest();
        System.out.println(data);

    }

    static Boolean StartTest() throws InterruptedException{

        Main main = new Main();
        String baseurl = "https://a101.com.tr";
        main.StartBrowser(baseurl);


//      Cookileri kabul et
        main.Click("/html/body/div[2]/div/div[4]/div[1]/div[2]/button[4]");

//      Diz altı çorap kategorisine git
        main.Navigate("[title='GİYİM & AKSESUAR']", "Dizaltı Çorap");

//      Çorap seç
        main.Click("/html/body/section/section[4]/div[3]/div[2]/div/div[2]/div[2]/div/ul/li[1]/article/a");

//      Renk sec
        main.Click("/html/body/section/section[3]/div[2]/div[1]/div/div[3]/div[1]/div[1]/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div/a");

//      Sepete Ekle
        main.Click("/html/body/section/section[3]/div[2]/div[1]/div/div[3]/div[2]/div[1]/button");

//      Sepete Git
        main.Click("/html/body/div[2]/div/div[1]/div/div[3]/a[3]");

//      Sepeti Onayla
        main.Click("/html/body/section/div[1]/div[2]/div/div[2]/div/a");

//      Üue olmadan devam
        main.Click("/html/body/section/div[1]/div/div[1]/div[1]/div[2]/a");

//      Mail adresi git
        main.Write("/html/body/section/div[1]/div/div[2]/div/div/form/div[1]/input" , System.currentTimeMillis()+"@mail.com");

//      Devam butonu
        main.Click("/html/body/section/div[1]/div/div[2]/div/div/form/button");

//      Adres oluştur
        main.Click("/html/body/section/section/div/div[2]/div/div[1]/div/div[1]/div[2]/ul[2]/li/a");

//      Adres başlığı
        main.Write("/html/body/div[1]/div/div[2]/form/div[2]/div/div/label/input",System.currentTimeMillis()+"");

//      İsim
        main.Write("/html/body/div[1]/div/div[2]/form/div[3]/div[1]/div/label/input",System.currentTimeMillis()+"John");

//      Soyisim
        main.Write("/html/body/div[1]/div/div[2]/form/div[3]/div[2]/div/label/input",System.currentTimeMillis()+"Doe");

//      Telefon numarası
        main.Write("/html/body/div[1]/div/div[2]/form/div[4]/div/div/label/input","08796524311");

//      il
        main.SelectBox("/html/body/div[1]/div/div[2]/form/div[5]/div[1]/div/label/div/select","İZMİR");

//      İlçe
        main.SelectBox("/html/body/div[1]/div/div[2]/form/div[5]/div[2]/div/label/div/select","BUCA");

//      Mahalle
        main.SelectBox("/html/body/div[1]/div/div[2]/form/div[6]/label/div/select","29 EKİM MAH");

//      Adres
        main.Write("/html/body/div[1]/div/div[2]/form/div[7]/label/textarea",System.currentTimeMillis()+"ev adresimi ekliyorum.");

//      Posta kodu
        main.Write("/html/body/div[1]/div/div[2]/form/div[8]/div/div/label/input","56478");

//      Kaydet
        main.Click("/html/body/div[1]/div/div[2]/form/button[1]");

//      İlk kargo firmasını seç
        main.ClickCss("div[class='check']");

//      Kaydet ve devam et
        main.Click("/html/body/section/section/div/div[2]/div/div[1]/div/div[2]/form/div[2]/button");


//      Siparişi tmamala
        Boolean data = main.Check("/html/body/section/section/div/div[3]/div[2]/div[1]/div[2]/form[1]/div[2]/div[2]/div[6]/button");

        main.StopBrowser();

        return data;
    }


}
