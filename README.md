# Калькулятор отпускных

## Endpoints 
**GET** http://localhost:8080/calculate  
Request body:
```
{
    "startVacationDate" : "YYYY-MM-DD", (optional)
    "endVacationDate" : "YYYY-MM-DD",   (oprional)
    "vacationDays" : 00,                (optional)
    "avgSalary": 000000
}
```
## Examples
**Calc with number of days**
![изображение](https://user-images.githubusercontent.com/75675407/196198334-aef7786a-b08d-4894-8942-f85675952fac.png)

**Calc with date of start and end of vacation**
![изображение](https://user-images.githubusercontent.com/75675407/196198769-6dec3d27-b08d-4793-9ab0-355a952d3ce8.png)

**Error**  
![изображение](https://user-images.githubusercontent.com/75675407/196199157-ae38efc5-108d-45c0-8487-fb59ad1ee1ab.png)
![изображение](https://user-images.githubusercontent.com/75675407/196199553-345e965d-1714-4c20-b570-4a460d12efc4.png)
