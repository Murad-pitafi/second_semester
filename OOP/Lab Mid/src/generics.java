class  generics<T> {
    T data;

    generics(T a) {
        this.data = a;
    }

    T getData() {
        return data;
    }


    public static void main(String[] args) {
        generics<Integer> obj = new generics<Integer>(67);

        System.out.println(" " + obj.getData() );
    }
}
