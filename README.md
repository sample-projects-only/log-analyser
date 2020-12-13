# Log Analyser

A simple utility to read, parse and flag the evens from a log file.

## To run the app

1. Clone the git repo

```shell
git clone https://github.com/chandanv89/log-analyser.git
```

2. Open the project in an IDE of your choice.
3. Run the main application - `com.github.chandanv89.loganalyser.LogAnalyser`.
    1. Create/Update the Run Configuration for the class to provide the program argument.<br />
       ![Edit Run Config window on Intellij](https://github.com/chandanv89/log-analyser/assets/run-config-loganalyser.png)
       <br />
       A sample log file is available in `resources/samples/logfile.txt`
    2. You can generate a sample log file using the
       utility `com.github.chandanv89.loganalyser.utilities.LogFileGenerator`. You can specify the number of events to
       be generated for the sample file.
    