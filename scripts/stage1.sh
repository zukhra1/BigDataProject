#downloading the dataset through powershell(windows)
$baseUrl = "https://data.sfgov.org/resource/wr8u-xric.csv"
$outputFolder = "./data"
$offset = 0
$limit = 1000

if (-not (Test-Path -Path $outputFolder)) {
    New-Item -ItemType Directory -Path $outputFolder
}

do {
    $url = "$baseUrl`?`$limit=$limit&`$offset=$offset"
    $fileName = "data_$offset.csv"
    $filePath = Join-Path -Path $outputFolder -ChildPath $fileName
    Invoke-WebRequest -Uri $url -OutFile $filePath
    $offset += $limit
} while ($limit -eq 1000)
