package pattern.simplefactory;

public class RouJiaMoStore {
    private SimpleRouJiaMoFactroy factroy;
    public RouJiaMoStore(SimpleRouJiaMoFactroy factroy){
        this.factroy=factroy;
    }
    public RouJiaMo sellRouJiaMo(String type)
    {
        RouJiaMo rouJiaMo = factroy.createRouJiaMo(type);
        rouJiaMo.prepare();
        rouJiaMo.fire();
        rouJiaMo.pack();
        return rouJiaMo;
    }
}
