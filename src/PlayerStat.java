public class PlayerStat {
    private int pstrength;
    private int pspeed;
    private int padaptability;
    private int pintelligence;
    private int phealth;
    public PlayerStat(int pstrength, int pspeed, int padaptability, int pintelligence, int phealth) {
        this.pstrength = pstrength;
        this.pspeed = pspeed;
        this.padaptability = padaptability;
        this.pintelligence = pintelligence;
        this.phealth = phealth;
    }
    public int getPStrength() {
        return pstrength;
    }
    public int getPSpeed() {
        return pspeed;
    }
    public int getPAdaptability() {
        return padaptability;
    }
    public int getPIntelligence() {
        return pintelligence;
    }
    public int getPHealth() {
        return phealth;
    }
}
