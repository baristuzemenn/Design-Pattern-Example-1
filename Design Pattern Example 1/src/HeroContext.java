public class HeroContext {
    State aliveState;
    State deadState;
    State silencedState;
    State invisibleState;

    State state;
    int hp = 0;

    public HeroContext(int hp){
        aliveState = new AliveState(this);
        deadState = new DeadState(this);
        silencedState = new SilencedState(this);
        invisibleState = new InvisibleState(this);
        state = aliveState;

        this.hp = hp;
        if (hp == 0){
            state = deadState;
        }
    }

    public void attack(){
        state.attack();
    }

    public void attacked(int damage){
        state.attacked(damage);
    }

    public void silenced(){
        state.silenced();
    }

    public void recovered(){
        state.recovered();
    }

    public void revived(int hp){
        state.revived(hp);
    }

    public void disappear(){state.disappear();}

    public void appear(){state.appear();}

    public void setState(State state){this.state = state;}

    public State getAliveState(){return aliveState;}
    public State getDeadState(){return deadState;}
    public State getSilencedState(){return silencedState;}
    public State getInvisibleState(){return invisibleState;}

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nHero Context\n================");
        result.append("\nHero HP " + hp);
        result.append("\nHero is " + state);
        return result.toString();
    }

}
