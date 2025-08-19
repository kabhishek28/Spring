package com.xworkz.formvalidation.service;

import com.xworkz.formvalidation.dto.*;
import com.xworkz.formvalidation.entity.*;
import com.xworkz.formvalidation.repository.TrainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrainerServiceImpl implements TrainerService {

    @Autowired
    private TrainerRepository trainerRepository;

    @Override
    public boolean saveBook(BookDto bookDto) {
        BookEntity entity = new BookEntity();
        entity.setTitle(bookDto.getTitle());
        entity.setAuthor(bookDto.getAuthor());
        entity.setPublisher(bookDto.getPublisher());
        entity.setYear(bookDto.getYear());
        entity.setIsbn(bookDto.getIsbn());
        entity.setPrice(bookDto.getPrice());
        entity.setGenre(bookDto.getGenre());
        return trainerRepository.saveBook(entity);
    }

    @Override
    public boolean saveCar(CarDto carDto) {
        CarEntity entity = new CarEntity();
        entity.setBrand(carDto.getBrand());
        entity.setModel(carDto.getModel());
        entity.setColor(carDto.getColor());
        entity.setYear(carDto.getYear());
        entity.setOwnerName(carDto.getOwnerName());
        entity.setPrice(carDto.getPrice());
        entity.setRegistrationNumber(carDto.getRegistrationNumber());
        return trainerRepository.saveCar(entity);
    }

    @Override
    public boolean saveCollege(CollegeDto collegeDto) {
        CollegeEntity entity = new CollegeEntity();
        entity.setName(collegeDto.getName());
        entity.setPrincipal(collegeDto.getPrincipal());
        entity.setLocation(collegeDto.getLocation());
        entity.setEstablishedYear(collegeDto.getEstablishedYear());
        entity.setStudents(collegeDto.getStudents());
        entity.setCourses(collegeDto.getCourses());
        entity.setAffiliation(collegeDto.getAffiliation());
        return trainerRepository.saveCollege(entity);
    }

    @Override
    public boolean saveCompany(CompanyDto companyDto) {
        CompanyEntity entity = new CompanyEntity();
        entity.setName(companyDto.getName());
        entity.setCeo(companyDto.getCeo());
        entity.setIndustry(companyDto.getIndustry());
        entity.setHeadquarters(companyDto.getHeadquarters());
        entity.setEmployees(companyDto.getEmployees());
        entity.setRevenue(companyDto.getRevenue());
        entity.setFounded(companyDto.getFounded());
        return trainerRepository.saveCompany(entity);
    }

    @Override
    public boolean saveDriver(DriverDto driverDto) {
        DriverEntity entity = new DriverEntity();
        entity.setName(driverDto.getName());
        entity.setAge(driverDto.getAge());
        entity.setPhone(driverDto.getPhone());
        entity.setEmail(driverDto.getEmail());
        entity.setPlace(driverDto.getPlace());
        entity.setLicenseNumber(driverDto.getLicenseNumber());
        entity.setVehicleType(driverDto.getVehicleType());
        return trainerRepository.saveDriver(entity);
    }

    @Override
    public boolean saveEmployee(EmployeeDto employeeDto) {
        EmployeeEntity entity = new EmployeeEntity();
        entity.setName(employeeDto.getName());
        entity.setAge(employeeDto.getAge());
        entity.setEmail(employeeDto.getEmail());
        entity.setDepartment(employeeDto.getDepartment());
        entity.setPhone(employeeDto.getPhone());
        entity.setSalary(employeeDto.getSalary());
        entity.setDesignation(employeeDto.getDesignation());
        return trainerRepository.saveEmployee(entity);
    }

    @Override
    public boolean saveHotel(HotelDto hotelDto) {
        HotelEntity entity = new HotelEntity();
        entity.setName(hotelDto.getName());
        entity.setLocation(hotelDto.getLocation());
        entity.setRooms(hotelDto.getRooms());
        entity.setManager(hotelDto.getManager());
        entity.setEmail(hotelDto.getEmail());
        entity.setPhone(hotelDto.getPhone());
        entity.setRating(hotelDto.getRating());
        return trainerRepository.saveHotel(entity);
    }

    @Override
    public boolean saveLaptop(LaptopDto laptopDto) {
        LaptopEntity entity = new LaptopEntity();
        entity.setBrand(laptopDto.getBrand());
        entity.setModel(laptopDto.getModel());
        entity.setProcessor(laptopDto.getProcessor());
        entity.setRam(laptopDto.getRam());
        entity.setStorage(laptopDto.getStorage());
        entity.setOs(laptopDto.getOs());
        entity.setPrice(laptopDto.getPrice());
        return trainerRepository.saveLaptop(entity);
    }

    @Override
    public boolean saveMobile(MobileDto mobileDto) {
        MobileEntity entity = new MobileEntity();
        entity.setBrand(mobileDto.getBrand());
        entity.setModel(mobileDto.getModel());
        entity.setOs(mobileDto.getOs());
        entity.setRam(mobileDto.getRam());
        entity.setStorage(mobileDto.getStorage());
        entity.setCamera(mobileDto.getCamera());
        entity.setPrice(mobileDto.getPrice());
        return trainerRepository.saveMobile(entity);
    }

    @Override
    public boolean saveMovie(MovieDto movieDto) {
        MovieEntity entity = new MovieEntity();
        entity.setTitle(movieDto.getTitle());
        entity.setDirector(movieDto.getDirector());
        entity.setProducer(movieDto.getProducer());
        entity.setYear(movieDto.getYear());
        entity.setGenre(movieDto.getGenre());
        entity.setRating(movieDto.getRating());
        entity.setLanguage(movieDto.getLanguage());
        return trainerRepository.saveMovie(entity);
    }

    @Override
    public boolean saveMusic(MusicDto musicDto) {
        MusicEntity entity = new MusicEntity();
        entity.setTitle(musicDto.getTitle());
        entity.setArtist(musicDto.getArtist());
        entity.setAlbum(musicDto.getAlbum());
        entity.setGenre(musicDto.getGenre());
        entity.setDuration(musicDto.getDuration());
        entity.setLanguage(musicDto.getLanguage());
        entity.setReleaseYear(musicDto.getReleaseYear());
        return trainerRepository.saveMusic(entity);
    }

    @Override
    public boolean savePg(PgDto pgDto) {
        PgEntity entity = new PgEntity();
        entity.setName(pgDto.getName());
        entity.setLocation(pgDto.getLocation());
        entity.setRooms(pgDto.getRooms());
        entity.setOwner(pgDto.getOwner());
        entity.setEmail(pgDto.getEmail());
        entity.setPhone(pgDto.getPhone());
        entity.setFacilities(pgDto.getFacilities());
        return trainerRepository.savePg(entity);
    }

    @Override
    public boolean saveStudent(StudentDto studentDto) {
        StudentEntity entity = new StudentEntity();
        entity.setName(studentDto.getName());
        entity.setAge(studentDto.getAge());
        entity.setRollNumber(studentDto.getRollNumber());
        entity.setCourse(studentDto.getCourse());
        entity.setEmail(studentDto.getEmail());
        entity.setPhone(studentDto.getPhone());
        entity.setCollege(studentDto.getCollege());
        return trainerRepository.saveStudent(entity);
    }

    @Override
    public boolean saveWoodland(WoodlandDto woodlandDto) {
        WoodlandEntity entity = new WoodlandEntity();
        entity.setName(woodlandDto.getName());
        entity.setLocation(woodlandDto.getLocation());
        entity.setOwner(woodlandDto.getOwner());
        entity.setArea(woodlandDto.getArea());
        entity.setType(woodlandDto.getType());
        entity.setContact(woodlandDto.getContact());
        entity.setFacilities(woodlandDto.getFacilities());
        return trainerRepository.saveWoodland(entity);
    }
}
