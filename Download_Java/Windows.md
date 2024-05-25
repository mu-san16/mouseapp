## Download Java

まず、JavaのダウンロードURLを取得して、Powershellを使用しダウンロードをする。
最新のURLはhttps://www.oracle.com/java/technologies/downloads/#jdk22-windows から取得できます

```bash
$url = "URL"
```
次の保存作のファイルを指定します。(xxx)にはバージョン名を入れると良いと思います。

```bash
$output = "C:\Users\YourUsername\Downloads\java -v xxx"
```
最後にファイルのダウンロードを行います

```bash
Invoke-WebRequest -Uri $url -OutFile $output
```

##　Install Java
ダウンロードしたインストーラーを実行してJavaをインストールする

```bash
Start-Process -FilePath $output -ArgumentList "/s" -NoNewWindow -Wait
```

## Set environment variable
Javaのインストールが完了したら、環境変数の設定を行う.まず、javaのインストールパスを設定します。
javaのversionの部分は自分のversionを入れてください

```bash
$javaHome = "C:\Program Files\Java\javaのversion"
```
次にJavaHomeの設定を行います。

```bash
[System.Environment]::SetEnvironmentVariable("JAVA_HOME", $javaHome, [System.EnvironmentVariableTarget]::Machine)
```
最後にPathの環境変数の更新を行います。

```bash
$path = [System.Environment]::GetEnvironmentVariable("Path", [System.EnvironmentVariableTarget]::Machine)
```

```bash
$newPath = "$path;$javaHome\bin"
[System.Environment]::SetEnvironmentVariable("Path", $newPath, [System.EnvironmentVariableTarget]::Machine)
```
ここまでできたら完了です。最後にJavaのバージョンを確認してインストールできたことを確認しましょう

```bash
java -version
```

