package homework_nr_12;

public enum CheckInteger {
    FIRST(1),
    SECOND(-34),
    THIRD(2345),
    FOURTH(0);

    private int i;

    CheckInteger(int i){
        this.i = i;
    }

    public boolean CHECK_IF_ODD(){
        return (i % 2 !=0);
    }

    public boolean CHECK_IF_EVEN(){
        return (i % 2 == 0);
    }

    public boolean CHECK_IF_NEGATIVE(){
        return (i < 0);
    }

    public boolean CHECK_IF_POSITIVE(){
        return (i > 0);
    }

}
