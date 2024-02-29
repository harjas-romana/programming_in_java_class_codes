import java.util.*;

class Process {
    int pid;
    int burstTime;
    int priority;
    int arrivalTime;
    int completionTime;

    public Process(int pid, int burstTime, int priority, int arrivalTime) {
        this.pid = pid;
        this.burstTime = burstTime;
        this.priority = priority;
        this.arrivalTime = arrivalTime;
        this.completionTime = 0;
    }
}

public class SJFScheduler {
    public static void main(String[] args) {
        List<Process> processes = generateProcesses();

        List<Process> completedProcesses = sjfScheduling(processes);

        for (Process process : completedProcesses) {
            System.out.println("Process " + process.pid + ": Burst Time = " + process.burstTime
                    + ", Completion Time = " + process.completionTime);
        }
    }

    public static List<Process> sjfScheduling(List<Process> processes) {
        List<Process> completedProcesses = new ArrayList<>();
        List<Process> readyQueue = new ArrayList<>();
        int currentTime = 0;
        Collections.sort(processes, Comparator.comparingInt(p -> p.arrivalTime));
        while (!processes.isEmpty() || !readyQueue.isEmpty()) {

            while (!processes.isEmpty() && processes.get(0).arrivalTime <= currentTime) {
                readyQueue.add(processes.remove(0));
            }

            if (!readyQueue.isEmpty()) {
                Collections.sort(readyQueue, Comparator.comparingInt(p -> p.burstTime));
                Process currentProcess = readyQueue.remove(0);
                currentTime += currentProcess.burstTime;
                currentProcess.completionTime = currentTime;
                completedProcesses.add(currentProcess);
            } else {
                currentTime = processes.get(0).arrivalTime;
            }
        }
        return completedProcesses;
    }
    public static List<Process> generateProcesses() {
        List<Process> processes = new ArrayList<>();
        processes.add(new Process(1, 5, 0, 0));
        processes.add(new Process(2, 3, 0, 1));
        processes.add(new Process(3, 7, 0, 2));
        processes.add(new Process(4, 2, 0, 3));
        return processes;
    }
}
