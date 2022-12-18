# FactoryMethod

やりたいこと
- インスタンスを生成するとき、コンストラクタを呼び出してオブジェクトを利用しているので、利用したい具象クラスを指定することになる。それはクラス間の結合を強くなってしまうので、この結合を弱めるための仕組みを作りたい。

どのように実現しているか
- インスタンスを生成して返す`Factory`を`TemplateMethod`パターンで作り、具象クラスで中身を肉付けする。

ユースケース
- 生成するインスタンスを条件分岐させるようなケース

具体例
```java
class Factory {
    AbstractDataReader create(int formatId) {
        AbstractDataReader reader = null;
        if (CSV == formatId) {
            reader = new CSVDataReaderd();
        } elseif (XML == formatId) {
            reader = new XMLDataReaderd();
        }
        return reader;
    }
}
```

`FactoryMethod`を利用することで以下のように簡単に利用できるなる
```java
AbstractDataReader reader = null;
Factory factory = new Factory;
reader = factory(formatId);
data = reader.read();
```