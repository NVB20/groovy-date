static def ourDateStamp(String format) {
    def currentDate = new Date()
    def formattedDate = currentDate.format(format)
    return formattedDate
}
