package net.greet;

public enum Languages {

    IsiXhosa("Mholo "),
    IsiNdebele("Salibonani "),
    Sepedi("Thobela "),
    English("Hello ");


    private String lang;

    Languages(String lang) {
        this.lang = lang;
    }

    public String getLang() {
        return lang;
    }
}
