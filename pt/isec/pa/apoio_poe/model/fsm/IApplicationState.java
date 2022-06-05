package pt.isec.pa.apoio_poe.model.fsm;

import pt.isec.pa.apoio_poe.model.data.person.Person;
import java.util.ArrayList;
import java.util.List;

public interface IApplicationState {
    boolean insertData(String file);

    String checkData();

    boolean editDataProposal(String identifier, String attribute, List<String> newValue);

    boolean editDataProfessor(String email, boolean advisor);

    boolean editDataStudent(String identifier, String change, String whatToChange);

    boolean deleteData(String identifier);

    boolean chooseType(String type);

    boolean closeState();

    boolean studentTransitioning();

    boolean professorTransitioning();

    boolean proposalTransitioning();

    boolean candidatureTransitioning();

    String listStudentsWithAutoProposal();

    String listStudentsWithCandidature();

    String listStudentsWithoutCandidature();

    String listAutoProposalWithoutCandidatures();

    String listAutoProposalWithCandidatures();

    boolean proposalAttributionTransitioning();

    boolean associateAttribution();

    boolean nonAssociateAttribution();

    boolean chooseStudentToAssociate(int index);

    ArrayList<Person> getTies();

    boolean manualAttribution(String idOfProposal, long idOfStudent);

    boolean manualRemoval(String idOfProposal);

    boolean professorAttributionTransitioning();

    String listStudentsWithProposalWithoutProfessor();

    String listStudentsWithProposalAndProfessor();

    String averageProfessorAttributions();

    String minimumProfessorAttributions();

    String maximumProfessorAttributions();

    String specificProfessorAttributions(String email);

    boolean listProposalsWithAttributions();

    boolean listProposalsWithoutAttributions();

    boolean listStudentsWithProposals();

    boolean listStudentsWithoutProposalsWithCandidature();

    ApplicationState getState();

    boolean removeProposalFromCandidature(String id, String proposal);

    boolean removeCandidature(String id);

    boolean editCandidatures(String id, String proposal);

    String listProposalsFilters(List<Integer> filters);

    String listStudentWithProposalAttributed();

    String listStudentWithoutProposalAttributed();

    boolean manualProfessorAttribution(String idOfProposal, String emailProfessor);

    boolean manualProfessorRemoval(String email, String idOfProposal);

    String getProfessorByEmail(String email);

    String listProfessorAttributions();

    void exportData();
}