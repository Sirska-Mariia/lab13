package ucu.edu.ua.task2;

public class DB extends БазаДаних{
    public String getUserData(){
        return super.отриматиДаніКористувача();
    }

    public String getStatitisticData(){
        return super.отриматиСтатистичніДані();
    }

    @Override @Deprecated
    public String отриматиДаніКористувача(){
        return super.отриматиДаніКористувача();
    }

    @Override @Deprecated
    public String отриматиСтатистичніДані(){
        return super.отриматиСтатистичніДані();
    }

}
