class Solution {
    public String destCity(List<List<String>> paths) {

        //Hashmap to hold cities with outgoing paths
        HashSet<String> cities = new HashSet<>();

        //Loop cityA
        for(List<String> path: paths){
            String city = path.get(0);
            cities.add(city);
        }
        
        //Loop cityB
        for(List<String> path: paths){
            String city = path.get(1);
            if(!cities.contains(city)) return city;
        }

        return "";
    }
}