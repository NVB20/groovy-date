def ourDateStamp(String format) {
    def currentDate = new Date()
    def formattedDate = currentDate.format(format)
    echo "Today is: ${format}"
    return formattedDate
}
