package me.whiteship.refactoring._03_long_function._13_replace_conditional_with_polymorphism;

import java.util.List;

public class PrinterFactory {

    private int totalNumberOfEvents;

    private List<Participant> participants;

    public PrinterFactory(int totalNumberOfEvents, List<Participant> participants) {
        this.totalNumberOfEvents = totalNumberOfEvents;
        this.participants = participants;
    }

    public StudyPrinter getPrinter(PrinterMode printerMode) {
        return switch (printerMode) {
            case CVS -> new CvsPrinter(totalNumberOfEvents, participants);
            case CONSOLE -> new ConsolePrinter(totalNumberOfEvents, participants);
            case MARKDOWN -> new MarkdownPrinter(totalNumberOfEvents, participants);
        };
    }
}
