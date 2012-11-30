# sbt-plugin-sandbox

sbtプラグインを試すためのプロジェクトです。


## インストール、実行方法

1. ソースをクローンする

  ローカルにリポジトリをクローンします。
  
  `git clone https://github.com/rabitarochan/sbt-plugin-sandbox.git`

2. コンパイル、ローカルへの発行

  ソースをコンパイルし、ローカルリポジトリへ発行します。

  `cd sbt-plugin-sandbox`

  `sbt`

  `> compile`

  `> publish-local`

3. プラグインの参照、設定を追加する

  以下 2つ のsbtファイルを修正し、プラグインの参照、設定を追加します。

  ```
  ( project/plugin.sbt )
  // remove a comment if enabling plugins.
  addPlugin( "com.rabitarochan" % "sbt-plugin-sandbox" % "0.1" )
  ```

  ```
  ( build.sbt )
  // remove a comment if enabling plugins.
  seq( sandbox2Settings: _* )
  ```

4. プロジェクト定義ファイルを再読み込みし、プラグインを有効化する

  `> reload`

  エラーが発生した場合は、適宜修正します。

一度この手順まで進めた場合、以下の手順を繰り返すことでsbtプラグインを修正、実行することができます。

1. プラグインを修正する

2. プラグインをコンパイルする

  `> compile`

3. プラグインをローカルに発行する

  `> publish-local`

4. sbtを一旦抜け、再度実行し、プラグインを更新する

  `> exit`

  `sbt`

  > sbtのコマンドでプラグインを更新する方法を見つける。

5. 実行!!

  `> someplugin someargs ...`


## 現在実装中のプラグイン

### sandbox1 プラグイン

与えられた引数をただ echo するだけのプラグインです。

```
> sandbox1 hoge fuga
sandbox1:
  1: hoge
  2: fuga
```

### sandbox2 プラグイン

与えられた引数をただ echo するだけのプラグインです。
`sandbox1`とは別の方法で実装しています。

```
> sandbox2 hoge fuga
sandbox2 args:
  1: hoge
  2: fuga
[success] Total time: 0 s, completed 2012/11/30 23:05:55
```
