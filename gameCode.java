class Winner {
    public boolean canWinGame(int n) {
        HashMap<Integer, Boolean> winScenarios = new HashMap<>();
        winScenarios.put(1, true);
        winScenarios.put(2, true);
        winScenarios.put(3, true);
        winScenarios.put(0, false);
        boolean canWin = recursion(winScenarios, n);
        return canWin;
    }
    
    public boolean recursion(HashMap<Integer, Boolean> hMap, int stonesLeft){
        if (hMap.containsKey(stonesLeft)){
            return hMap.get(stonesLeft);
        }
        for (int i = 1; i < 4; i++){
            if (recursion(hMap, stonesLeft-i) == false){
                hMap.put(stonesLeft, true);
                return true;
            }
        }
        hMap.put(stonesLeft, false);
        return false;
    }
}
