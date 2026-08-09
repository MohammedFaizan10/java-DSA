    char[] chPattern = s1.toCharArray();
    for (int i = 0; i < s1.length(); i++) {
        map.put(chPattern[i],map.getOrDefault(chPattern[i], 0) +1);
    }

    for(int we = 0 ; we < s2.length(); we++)
    {
        //check if element is present in map
        //if present reduce the count and if equal to 0 increase match by 1
        // if(match == patter.len) we found the value and return true
        // else 2 are found and we did not find 3rd we decrease match and increase count of element in map

        if(map.containsKey(s2.charAt(we))){
            map.put(s2.charAt(we),map.get(s2.charAt(we)) -1);
            if(map.get(s2.charAt(we)) == 0){
                match ++;
            }
        }
        if(match == s1.length()){
            return  true;
        }
        if(s1.length() == we -ws +1) {
            if(map.containsKey(s2.charAt(ws)))
            {
                map.put(s2.charAt(ws), map.get(s2.charAt(ws))+1);
                match --;
            }
            ws++;
        }
    }
    return  false;
    
}