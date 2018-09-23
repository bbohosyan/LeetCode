import java.util.concurrent.ConcurrentHashMap;
/*
// Employee info
class Employee {
    // It's the unique id of each node;
    // unique id of this employee
    public int id;
    // the importance value of this employee
    public int importance;
    // the id of direct subordinates
    public List<Integer> subordinates;
};
*/

class Solution {
    public int getImportance(List<Employee> employees, int id) {
        int result = 0;
        Employee employee = employees.stream().map(employee1 -> (Employee)employee1).filter(employee1 -> employee1.id == id).findFirst().orElse(null);
        Map<Integer, Employee> allSubordinates = new ConcurrentHashMap<>();
        allSubordinates.put(employee.id, employee);
        while (true){
            int allSubordinatesLength = allSubordinates.size();
            for(Map.Entry<Integer, Employee> entry : allSubordinates.entrySet()) {
                Integer key = entry.getKey();
                Employee value = entry.getValue();
                /**
                 *    Iterator it = map.entrySet().iterator();
                 *    while (it.hasNext())
                 *    {
                 *       Entry item = it.next();
                 *       it.remove();
                 *    }
                 */
                for (int i = 0; i < value.subordinates.size(); i++){
                    int idd = value.subordinates.get(i);
                    Employee employee2 = employees.stream().map(employee1 -> (Employee)employee1).filter(employee1 -> employee1.id == idd).findFirst().orElse(null);
                    allSubordinates.put(idd, employee2);
                }
            }
            if (allSubordinatesLength == allSubordinates.size()){
                break;
            }
        }
        for(Map.Entry<Integer, Employee> entry : allSubordinates.entrySet()) {
            result+=entry.getValue().importance;
        }
        return result;
    }

}