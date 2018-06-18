function storeValues(form) {
    setCookie("totalSqFt", form.field1.value);
    setCookie("purchaseTotal", form.field2.value);
    setCookie("tenantSpace1", form.field3.value);
    setCookie("tenantSpace2", form.field4.value);
    setCookie("tenantSpace3", form.field5.value);
    setCookie("tenantSpace4", form.field6.value);

    setCookie("commonSpace1", form.field7.value);

    setCookie("commonSpace1", form.field8.value);


    return true;
}