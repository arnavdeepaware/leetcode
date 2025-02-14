class ProductOfNumbers {
    ArrayList<Integer> products = new ArrayList<>();
    int size = 0;

    public ProductOfNumbers() {
        products.add(1);
        this.size = 0;
    }
    
    public void add(int num) {
        if(num == 0){
            products = new ArrayList<>();
            products.add(1);
            this.size = 0;
        }else{
            products.add(products.get(size) * num);
            this.size++;
        }
    }
    
    public int getProduct(int k) {
        if(k > this.size){
            return 0;
        }

        return products.get(this.size) / products.get(this.size - k);
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */