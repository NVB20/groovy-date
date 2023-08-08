def call(String format){
    name = sh script : "echo ${format}"
    return name
}
return name