#  Case Study

## Bağımlılıklar

- Java
- Maven

## Kurulum

1. Repository'yi klonlayın

```shell
git clone https://github.com/gazi-aycil
```

2. Maven ile bağımlılıkları kurun.

```shell
mvn compile
```

3. data.json dosyasını düzenleyin.


## Testleri Çalıştırma

**Chrome ile çalıştırmak için;**
```shell
DRIVER=chrome mvn test
```

**Firefox ile çalıştırmak için;**

```shell
DRIVER=firefox mvn test
```

Herhangi bir driver belirtilmediği durumda testler `Chrome` ile çalışacaktır.


## Raporlar ve ekran görüntüleri

testleri çalıştırdıktan sonra raporlar `./allure-results` dizininde oluşturulacaktır. Raporları `allure serve` komutunu çalıştırarak raporları görebilirsiniz. 
