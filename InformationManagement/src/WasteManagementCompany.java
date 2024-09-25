public class WasteManagementCompany {
    String companyName;
    String ownerName;
    String officeAddress;

    // subclass: payroll, billing
}

public class Customer{
    String customerName;
    String customerAddress;
    
    // business, apartment block, individual residence, hospital
}

public class Employee{
    String employeeName;
    String job;
    // accountant, binpeople, hr, marketing, IT
}

public class Service{
    // type of waste dealt with (determined by waste type)
    // scale of operation (depending on customer type)
}

public class Vehicle{
    String liscencePlate;
    double capacity;
    // truck (do they differ depending on the service)
}

public class Waste{
    String wastetype;
    double wasteSize;
    // recyclable, hazardous, general, organic
}

public class Bin{
    double capacity;
    String wasteTypeBin;

    // waste capacity (determined by scale of operation in service)
    // type of waste
}

public class Billing{
    // determined by service attributes
}

public class Payroll{
    
}

public class Depot{
    String depotAddress;
}

