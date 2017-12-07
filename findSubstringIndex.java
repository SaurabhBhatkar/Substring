public int findSubstringIndex(String fullword, String subword) {
     
    if(subword.length() == 0)
        return 0;
 
    for(int i=0; i<fullword.length(); i++){
        int a = i;
        for(int j=0; j<subword.length(); j++){
            if(subword.charAt(j)==fullword.charAt(a)){
                if(j==subword.length()-1)
                    return i;
                a++;
            }else{
                break;
            }
 
        }    
    }   
 
    return -1;
}