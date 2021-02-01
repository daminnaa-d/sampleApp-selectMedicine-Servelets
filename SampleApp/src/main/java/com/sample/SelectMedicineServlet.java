package com.sample;

import com.sample.model.MedicineType;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet(
        name = "selectmedicineservlet",
        urlPatterns = "/SelectMedicine"
)


public class SelectMedicineServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String medicineType = req.getParameter("Type");

        MedicineService medicineService = new MedicineService();
        MedicineType l = MedicineType.valueOf(medicineType);

        List medicineBrands = medicineService.getAvailableBrands(l);

        req.setAttribute("brands", medicineBrands);
        RequestDispatcher view = req.getRequestDispatcher("result.jsp");
        view.forward(req, resp);

    }
}
