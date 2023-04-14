class Phone {

    String ownerName;
    String number;
    String countryCode;
    String cityCode;

    public Phone(String ownerName, String number, String countryCode, String cityCode) {
        this.ownerName = ownerName;
        this.number = number;
        this.countryCode = countryCode;
        this.cityCode = cityCode;
    }

    public Phone(String ownerName, String number) {
        this.ownerName = ownerName;
        this.number = number;
    }
}