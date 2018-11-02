package com.david;

class StringServer {

    public String toNoChange(String str){
        return str;
    }

    public String toUpper(String str){
        return str.toUpperCase();
    }

    public String toLower(String str) {
        return str.toLowerCase();
    }

    public String toReverse(String str){
        StringBuilder buff = new StringBuilder(str);
        buff = buff.reverse();
        return buff.toString();
    }

    public String toRemoveSpaces(String str){
        return(str.replaceAll(" ",""));
    }
}
